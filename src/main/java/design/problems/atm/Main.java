package design.problems.atm;

public class Main {
    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine(10, 10, 10, 10);
        User user = new User("Sahil Yadav");
        BankAccount bankAccount = new BankAccount(1000, user);
        ATMCard atmCard = new ATMCard(bankAccount, 1234);
        atmMachine.getCurrentState().insertCard(atmMachine, atmCard);
        atmMachine.getCurrentState().authenticatePin(atmMachine, atmCard, 1234);
        atmMachine.getCurrentState().selectOperation(atmMachine, atmCard, TransactionType.CHECK_BALANCE);
        atmMachine.getCurrentState().displayBalance(atmMachine, atmCard);
    }
}
