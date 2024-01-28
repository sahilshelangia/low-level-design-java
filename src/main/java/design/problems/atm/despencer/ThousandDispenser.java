package design.problems.atm.despencer;

import design.problems.atm.ATMMachine;

public class ThousandDispenser extends Dispenser {
    public ThousandDispenser(Dispenser nextDispenser) {
        super(nextDispenser);
    }

    @Override
    public void process(ATMMachine atmMachine, Integer amount) {
        int maxPossibleNotes = Math.min(amount / 1000, atmMachine.getHundredNotes());
        int remainingAmount = amount - 1000 * maxPossibleNotes;
        atmMachine.deductHundredNotes(maxPossibleNotes);
        if (maxPossibleNotes != 0) {
            System.out.println(maxPossibleNotes + " note of 1000");
        }
        super.process(atmMachine, remainingAmount);
    }
}
