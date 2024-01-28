package design.problems.splitwise.expense;

import design.problems.splitwise.split.Split;
import design.problems.splitwise.user.User;

import java.util.List;

public class Expense {
    String id;
    String description;
    User paidBy;
    List<Split> splits;
    double amount;

    public Expense(String id, String description, User paidBy, List<Split> splits, double amount) {
        this.id = id;
        this.description = description;
        this.paidBy = paidBy;
        this.splits = splits;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public List<Split> getSplits() {
        return splits;
    }

    public double getAmount() {
        return amount;
    }
}
