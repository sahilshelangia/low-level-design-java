package design.problems.atm.despencer;

import design.problems.atm.ATMMachine;

public class FiveHundredDispenser extends Dispenser {
    public FiveHundredDispenser(Dispenser nextDispenser) {
        super(nextDispenser);
    }

    @Override
    public void process(ATMMachine atmMachine, Integer amount) {
        int maxPossibleNotes = Math.min(amount / 500, atmMachine.getFiveHundredNotes());
        int remainingAmount = amount - 500 * maxPossibleNotes;
        atmMachine.deductFiveHundredNotes(maxPossibleNotes);
        if (maxPossibleNotes != 0) {
            System.out.println(maxPossibleNotes + " note of 500");
        }
        super.process(atmMachine, remainingAmount);
    }
}
