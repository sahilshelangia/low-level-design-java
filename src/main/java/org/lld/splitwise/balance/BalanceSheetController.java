package org.lld.splitwise.balance;

import org.lld.splitwise.expense.Expense;
import org.lld.splitwise.split.Split;
import org.lld.splitwise.user.User;


public class BalanceSheetController {
    public void updateBalanceSheet(Expense expense) {
        // todo: whenever any expense takes place, this function needs to be called.
        // responsibility: update the balance sheet of the given user based on the expense.

        // step 1: user who paid, update total payment for that.
        User expensePaidBy = expense.getPaidBy();
        double totalPayment = expensePaidBy.getBalanceSheet().getTotalPayment() + expense.getAmount();
        expensePaidBy.getBalanceSheet().setTotalPayment(totalPayment);

        // step 2: update other users based on splits.
        for (Split split : expense.getSplits()) {
            User user = split.getUser();
            double amount = split.getAmountOwe();
            BalanceSheet userBalanceSheet = user.getBalanceSheet();

            // update total expense of a user.
            userBalanceSheet.setTotalExpense(user.getBalanceSheet().getTotalExpense() + split.getAmountOwe());

            if (!isPaidByUser(split, expensePaidBy)) {
                // update lendMoney and oweMoney.
                expensePaidBy.getBalanceSheet().setLendMoney(expensePaidBy.getBalanceSheet().getLendMoney() + amount);
                userBalanceSheet.setOweMoney(userBalanceSheet.getOweMoney() + amount);

                // update user<>balance map
                if (!expensePaidBy.getBalanceSheet().getUserBalanceMap().containsKey(user)) {
                    expensePaidBy.getBalanceSheet().getUserBalanceMap().put(user, new Balance());
                }
                if (!user.getBalanceSheet().getUserBalanceMap().containsKey(expensePaidBy)) {
                    user.getBalanceSheet().getUserBalanceMap().put(expensePaidBy, new Balance());
                }

                Balance b1 = expensePaidBy.getBalanceSheet().getUserBalanceMap().get(user);
                b1.setOwe(b1.getOwe() + amount);

                Balance b2 = user.getBalanceSheet().getUserBalanceMap().get(expensePaidBy);
                b2.setLend(b1.getLend() + amount);
            }
        }
    }

    private boolean isPaidByUser(Split split, User expensePaidBy) {
        return split.getUser().getId().equals(expensePaidBy.getId());
    }

    public void show(User user) {
        System.out.println(String.format("Balance sheet of %s (user_id: %s)", user.getName(), user.getId()));
        BalanceSheet balanceSheet = user.getBalanceSheet();
        System.out.println(String.format("total payment: %f", balanceSheet.getTotalPayment()));
        System.out.println(String.format("total expense: %f", balanceSheet.getTotalExpense()));
        System.out.println(String.format("lend amount: %f", balanceSheet.getLendMoney()));
        System.out.println(String.format("owe amount: %f", balanceSheet.getOweMoney()));

        for (User u : balanceSheet.getUserBalanceMap().keySet()) {
            Balance balance = balanceSheet.getUserBalanceMap().get(u);
            System.out.println(String.format("%s (id: %s) will give back %f and you owe %f", u.getName(), u.getId(), balance.getOwe(), balance.getLend()));
        }
        System.out.println("-".repeat(50));
    }
}
