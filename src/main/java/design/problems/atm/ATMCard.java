package design.problems.atm;

public class ATMCard {
    private Integer pin;
    private BankAccount bankAccount;

    public ATMCard(BankAccount bankAccount, Integer pin) {
        this.bankAccount = bankAccount;
        this.pin = pin;
    }

    public boolean isCorrectPin(int pin) {
        return this.pin.equals(pin);
    }

    public int getBalance() {
        return this.bankAccount.getBalance();
    }

    public void updateBalance(int amount) {
        this.bankAccount.updateBalance(amount);
    }
}
