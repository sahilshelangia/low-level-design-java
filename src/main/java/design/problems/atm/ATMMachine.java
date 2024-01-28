package design.problems.atm;

import design.problems.atm.states.ATMState;
import design.problems.atm.states.IdleState;

public class ATMMachine {
    private int fiftyNotes;
    private int hundredNotes;
    private int fiveHundredNotes;
    private int thousandNotes;

    private int balance;

    private ATMState currentState;

    public ATMMachine(int fiftyNotes, int hundredNotes, int fiveHundredNotes, int thousandNotes) {
        this.fiftyNotes = fiftyNotes;
        this.hundredNotes = hundredNotes;
        this.fiveHundredNotes = fiveHundredNotes;
        this.thousandNotes = thousandNotes;

        balance = fiftyNotes * 50 + hundredNotes * 100 + fiveHundredNotes * 500 + thousandNotes * 1000;
        this.currentState = new IdleState();
    }

    public ATMState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(ATMState currentState) {
        this.currentState = currentState;
    }

    public int getBalance() {
        return this.balance;
    }
    public void deductFiftyNotes(int cnt) {
        this.fiftyNotes = this.fiftyNotes - cnt;
        balance = balance - cnt * 50;
    }

    public void deductHundredNotes(int cnt) {
        this.hundredNotes = this.hundredNotes - cnt;
        balance = balance - cnt * 100;
    }

    public void deductFiveHundredNotes(int cnt) {
        this.fiveHundredNotes = this.fiveHundredNotes - cnt;
        balance = balance - cnt * 500;
    }

    public void deductThousandNotes(int cnt) {
        this.thousandNotes = this.thousandNotes - cnt;
        balance = balance - cnt * 1000;
    }

    public int getFiftyNotes(){
        return this.fiftyNotes;
    }

    public int getHundredNotes(){
        return this.hundredNotes;
    }

    public int getFiveHundredNotes(){
        return this.fiveHundredNotes;
    }

    public int getThousandNotes(){
        return this.thousandNotes;
    }
}
