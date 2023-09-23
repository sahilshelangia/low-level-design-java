package org.lld.splitwise.expense;

import org.lld.splitwise.balance.BalanceSheetController;
import org.lld.splitwise.split.Split;
import org.lld.splitwise.user.User;

import java.util.List;

public class ExpenseController {
    BalanceSheetController balanceSheetController;

    public ExpenseController() {
        balanceSheetController = new BalanceSheetController();
    }

    public Expense createExpense(String id, String description, User paidBy, List<Split> splits, double amount) {
        Expense expense = new Expense(id, description, paidBy, splits, amount);
        balanceSheetController.updateBalanceSheet(expense);
        return expense;
    }
}
