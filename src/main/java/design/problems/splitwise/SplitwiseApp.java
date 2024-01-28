package design.problems.splitwise;

import design.problems.splitwise.balance.BalanceSheetController;
import design.problems.splitwise.group.Group;
import design.problems.splitwise.group.GroupController;
import design.problems.splitwise.split.Split;
import design.problems.splitwise.user.User;
import design.problems.splitwise.user.UserController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitwiseApp {
    UserController userController;
    GroupController groupController;
    BalanceSheetController balanceSheetController;

    public SplitwiseApp() {
        userController = new UserController();
        groupController = new GroupController();
        balanceSheetController = new BalanceSheetController();
    }

    public void run() {
        addUsers();
        initializeGroups();
        addExpenses();
        showBalanceSheet();
    }

    private void showBalanceSheet() {
        List<User> users = userController.getUsers();
        for (User user : users) {
            balanceSheetController.show(user);
        }
    }

    private void addExpenses() {
        // user(id:01) paid 500rs on behalf of everyone for bunjee jumping.
        User user1 = userController.getUserId("01");
        Group group = groupController.getGroupById("01");
        List<Split> splits1 = new ArrayList<>(Arrays.asList(
                new Split(userController.getUserId("01"), 100),
                new Split(userController.getUserId("02"), 100),
                new Split(userController.getUserId("03"), 100),
                new Split(userController.getUserId("04"), 100),
                new Split(userController.getUserId("05"), 100)
        ));
        group.createExpense("01", "bunjee jumping", user1, splits1, 500);


        // user(id:02) paid 1200rs, 3 of them did river rafting and two of them did zip-line.
        User user2 = userController.getUserId("02");
        List<Split> splits2 = new ArrayList<>(Arrays.asList(
                new Split(userController.getUserId("01"), 200),
                new Split(userController.getUserId("02"), 200),
                new Split(userController.getUserId("03"), 200),
                new Split(userController.getUserId("04"), 300),
                new Split(userController.getUserId("05"), 300)
        ));
        group.createExpense("02", "river-rafting and zip-line", user2, splits2, 1200);
    }


    private void initializeGroups() {
        User user = userController.getUserId("01");
        Group group = groupController.createGroup("01", "Trip to Rishikesh", user);
        group.addMember(userController.getUserId("02"));
        group.addMember(userController.getUserId("03"));
        group.addMember(userController.getUserId("04"));
        group.addMember(userController.getUserId("05"));
    }

    private void addUsers() {
        userController.addUser(new User("01", "Sahil"));
        userController.addUser(new User("02", "Sanjit"));
        userController.addUser(new User("03", "Surender"));
        userController.addUser(new User("04", "Sanyam"));
        userController.addUser(new User("05", "Sanjal"));
    }
}
