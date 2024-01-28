package design.problems.atm.states;

import design.problems.atm.ATMMachine;
import design.problems.atm.ATMCard;
import design.problems.atm.TransactionType;

public class SelectOperationState extends ATMState{
    public SelectOperationState(){
        showOperations();
    }

    @Override
    public void selectOperation(ATMMachine atmMachine, ATMCard ATMCard, TransactionType transactionType) {
        switch (transactionType){
            case CASH_WITHDRAWAL:
                atmMachine.setCurrentState(new CashWithdrawalState());
                break;
            case CHECK_BALANCE:
                atmMachine.setCurrentState(new CheckBalanceState());
                break;
            default:
                System.out.println("Invalid operation");
                exit(atmMachine);
        }
    }

    @Override
    public void returnCard() {
        super.returnCard();
    }

    @Override
    public void exit(ATMMachine atmMachine) {
        returnCard();
        System.out.println("Please collect your card");
        atmMachine.setCurrentState(new IdleState());
    }

    private void showOperations(){
        System.out.println("Please select the operation");
        TransactionType.showAllTransactionTypes();
    }
}
