package design.problems.atm;

public class BankAccount {
    private int balance;
    private User user;

    public BankAccount(int balance, User user) {
        this.balance = balance;
        this.user = user;
    }

    // amount will be added to the current balance.
    public void updateBalance(int amount) {
        this.balance = this.balance + amount;
    }

    public int getBalance() {
        return this.balance;
    }
}
