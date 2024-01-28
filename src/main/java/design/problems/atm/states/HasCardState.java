package design.problems.atm.states;

import design.problems.atm.ATMMachine;
import design.problems.atm.ATMCard;

public class HasCardState extends ATMState {
    @Override
    public void authenticatePin(ATMMachine atmMachine, ATMCard ATMCard, Integer pin) {
        if(ATMCard.isCorrectPin(pin)){
            System.out.println("Authenticated successfully");
            atmMachine.setCurrentState(new SelectOperationState());
        } else{
            System.out.println("Incorrect pin");
            exit(atmMachine);
        }
    }

    @Override
    public void returnCard() {
        System.out.println("Collect your card");
    }

    @Override
    public void exit(ATMMachine atmMachine) {
        returnCard();
        atmMachine.setCurrentState(new IdleState());
        System.out.println("Successfully exited");
        super.exit(atmMachine);
    }
}
