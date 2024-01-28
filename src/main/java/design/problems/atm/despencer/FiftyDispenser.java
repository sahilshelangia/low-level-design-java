package design.problems.atm.despencer;

import design.problems.atm.ATMMachine;

public class FiftyDispenser extends Dispenser {
    public FiftyDispenser(Dispenser nextDispenser) {
        super(nextDispenser);
    }

    @Override
    public void process(ATMMachine atmMachine, Integer amount) {
        int maxPossibleNotes = Math.min(amount / 50, atmMachine.getHundredNotes());
        int remainingAmount = amount - 50 * maxPossibleNotes;
        atmMachine.deductFiftyNotes(maxPossibleNotes);
        if (maxPossibleNotes != 0) {
            System.out.println(maxPossibleNotes + " note of 50");
        }
        super.process(atmMachine, remainingAmount);
    }
}
