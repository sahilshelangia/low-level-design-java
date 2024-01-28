package design.problems.splitwise.balance;

import design.problems.splitwise.user.User;

import java.util.HashMap;
import java.util.Map;

public class BalanceSheet {
    double totalPayment;
    double totalExpense;

    // something that you have to take.
    double lendMoney;

    // something that you have to give.
    double oweMoney;

    Map<User, Balance> userBalanceMap;

    public BalanceSheet() {
        totalPayment = 0;
        totalExpense = 0;
        lendMoney = 0;
        oweMoney = 0;
        userBalanceMap = new HashMap<>();
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    public double getLendMoney() {
        return lendMoney;
    }

    public double getOweMoney() {
        return oweMoney;
    }

    public Map<User, Balance> getUserBalanceMap() {
        return userBalanceMap;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public void setTotalExpense(double totalExpense) {
        this.totalExpense = totalExpense;
    }

    public void setLendMoney(double lendMoney) {
        this.lendMoney = lendMoney;
    }

    public void setOweMoney(double oweMoney) {
        this.oweMoney = oweMoney;
    }
}
