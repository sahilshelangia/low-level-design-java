package design.problems.splitwise.group;

import design.problems.splitwise.expense.Expense;
import design.problems.splitwise.expense.ExpenseController;
import design.problems.splitwise.user.User;
import design.problems.splitwise.split.Split;

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
