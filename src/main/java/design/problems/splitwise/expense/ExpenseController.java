package design.problems.splitwise.expense;

import design.problems.splitwise.balance.BalanceSheetController;
import design.problems.splitwise.split.Split;
import design.problems.splitwise.user.User;

import java.util.List;

public class ExpenseController {
    BalanceSheetController balanceSheetController;

    public ExpenseController() {
        balanceSheetController = new BalanceSheetController();
    }

    public Expense createExpense(String id, String description, User paidBy, List<Split> splits, double amount) {
        // todo: some validator??
        Expense expense = new Expense(id, description, paidBy, splits, amount);
        balanceSheetController.updateBalanceSheet(expense);
        return expense;
    }
}
