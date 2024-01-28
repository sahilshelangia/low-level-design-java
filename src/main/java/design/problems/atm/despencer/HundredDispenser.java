package design.problems.atm.despencer;

import design.problems.atm.ATMMachine;

public class HundredDispenser extends Dispenser{
    public HundredDispenser(Dispenser nextDispenser) {
        super(nextDispenser);
    }

    @Override
    public void process(ATMMachine atmMachine, Integer amount) {
        int maxPossibleNotes = Math.min(amount / 100, atmMachine.getHundredNotes());
        int remainingAmount = amount - 100 * maxPossibleNotes;
        atmMachine.deductHundredNotes(maxPossibleNotes);
        if (maxPossibleNotes != 0) {
            System.out.println(maxPossibleNotes + " note of 100");
        }
        super.process(atmMachine, remainingAmount);
    }
}
