package design.problems.atm.states;

import design.problems.atm.ATMMachine;
import design.problems.atm.ATMCard;
import design.problems.atm.TransactionType;

public abstract class ATMState {
    public void insertCard(ATMMachine atmMachine, ATMCard ATMCard){
        System.out.println("Something went wrong");
    };

    public void authenticatePin(ATMMachine atmMachine, ATMCard ATMCard, Integer pin){
        System.out.println("Something went wrong");
    };

    public void selectOperation(ATMMachine atmMachine, ATMCard ATMCard, TransactionType transactionType){
        System.out.println("Something went wrong");
    };

    public void cashWithdrawal(ATMMachine atmMachine, ATMCard ATMCard, Integer withdrawAmount){
        System.out.println("Something went wrong");
    };

    public void displayBalance(ATMMachine atmMachine, ATMCard ATMCard){
        System.out.println("Something went wrong");
    }

    public void returnCard(){
        System.out.println("Something went wrong");
    }

    public void exit(ATMMachine atmMachine){
        System.out.println("Something went wrong");
    }
}
