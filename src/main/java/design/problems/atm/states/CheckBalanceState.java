package design.problems.atm.states;

import design.problems.atm.ATMMachine;
import design.problems.atm.ATMCard;
import design.problems.atm.TransactionType;

public class CheckBalanceState extends ATMState{
    @Override
    public void displayBalance(ATMMachine atmMachine, ATMCard atmCard) {
        System.out.println("Current account balance:" + atmCard.getBalance());
        exit(atmMachine);
    }

    @Override
    public void returnCard() {
        System.out.println("Successfully returned the card");
    }

    @Override
    public void exit(ATMMachine atmMachine) {
        returnCard();
        atmMachine.setCurrentState(new IdleState());
        System.out.println("Exits");
    }
}
