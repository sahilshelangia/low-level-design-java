package design.patterns.command;

public class Main {
    public static void main(String[] args) {
        TV tv=new TV("ON");

        // remote creation
        Remote remote = new Remote();
        remote.setCommand(new TurnTVOnCommand(tv));

        remote.pressButton();
    }
}
