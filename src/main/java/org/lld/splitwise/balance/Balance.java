package org.lld.splitwise.balance;

public class Balance {
    double owe;
    double lend;

    public Balance(double owe, double lend) {
        this.owe = owe;
        this.lend = lend;
    }

    public double getOwe() {
        return owe;
    }

    public double getLend() {
        return lend;
    }

    public Balance() {
    }

    public void setOwe(double owe) {
        this.owe = owe;
    }

    public void setLend(double lend) {
        this.lend = lend;
    }
}
