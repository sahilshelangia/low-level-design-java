package design.problems.atm.despencer;

import design.problems.atm.ATMMachine;

public abstract class Dispenser {
    private Dispenser nextDispenser;

    public Dispenser(Dispenser nextDispenser) {
        this.nextDispenser = nextDispenser;
    }

    public void process(ATMMachine atmMachine, Integer amount){
        if(nextDispenser!=null){
            this.nextDispenser.process(atmMachine, amount);
        }
        else{
            if(amount!=0){
                System.out.println("Can't dispense the complete amount");
            }
        }
    }
}
