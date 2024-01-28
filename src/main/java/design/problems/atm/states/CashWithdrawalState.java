package design.problems.atm.states;

import design.problems.atm.ATMMachine;
import design.problems.atm.ATMCard;
import design.problems.atm.despencer.*;

public class CashWithdrawalState extends ATMState {
    @Override
    public void cashWithdrawal(ATMMachine atmMachine, ATMCard ATMCard, Integer withdrawAmount) {
        if (atmMachine.getBalance() < withdrawAmount) {
            System.out.println("ATM have insufficient funds");
            exit(atmMachine);
        } else if (ATMCard.getBalance() < withdrawAmount) {
            System.out.println("Card doesn't  have sufficient funds");
            exit(atmMachine);
        } else {
            ATMCard.updateBalance(withdrawAmount);
            // initiate chain for dispenser.
            Dispenser dispenser = new ThousandDispenser(new FiveHundredDispenser(new HundredDispenser(new FiftyDispenser(null))));
            dispenser.process(atmMachine, withdrawAmount);
            exit(atmMachine);
        }
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }

    @Override
    public void exit(ATMMachine atmMachine) {
        returnCard();
        atmMachine.setCurrentState(new IdleState());
        System.out.println("Exit happens");
    }
}
