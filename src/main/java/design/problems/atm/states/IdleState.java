package design.problems.atm.states;

import design.problems.atm.ATMMachine;
import design.problems.atm.ATMCard;

public class IdleState extends ATMState{
    @Override
    public void insertCard(ATMMachine atmMachine, ATMCard ATMCard) {
        System.out.println("Card is inserted successfully.");
        atmMachine.setCurrentState(new HasCardState());
    }
}
