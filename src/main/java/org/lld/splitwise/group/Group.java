package org.lld.splitwise.group;

import org.lld.splitwise.expense.Expense;
import org.lld.splitwise.expense.ExpenseController;
import org.lld.splitwise.split.Split;
import org.lld.splitwise.user.User;

import java.util.ArrayList;
import java.util.List;

public class Group {
    String id;
    String description;

    List<User> members;

    List<Expense> expenses;
    ExpenseController expenseController;

    public void createExpense(String id, String description, User paidBy, List<Split> splits, double amount) {
        Expense expense = expenseController.createExpense(id, description, paidBy, splits, amount);
        expenses.add(expense);
    }

    public Group(String id, String description) {
        this.id = id;
        this.description = description;
        members = new ArrayList<>();
        expenses = new ArrayList<>();
        expenseController = new ExpenseController();
    }

    public void addMember(User user) {
        members.add(user);
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public List<User> getMembers() {
        return members;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

}
