package design.problems.splitwise.split;

import design.problems.splitwise.user.User;

public class Split {
    User user;
    double amountOwe;

    public Split(User user, double amountOwe) {
        this.user = user;
        this.amountOwe = amountOwe;
    }

    public User getUser() {
        return user;
    }

    public double getAmountOwe() {
        return amountOwe;
    }
}
