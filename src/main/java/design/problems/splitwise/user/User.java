package design.problems.splitwise.user;

import design.problems.splitwise.balance.BalanceSheet;

public class User {
    String id;
    String name;
    BalanceSheet balanceSheet;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
        this.balanceSheet = new BalanceSheet();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BalanceSheet getBalanceSheet() {
        return balanceSheet;
    }
}
