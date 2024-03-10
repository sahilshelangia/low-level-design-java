package design.patterns.command;

public class TurnTVOnCommand implements ICommand{
    private TV tv;

    public TurnTVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.turnOff();
    }

    @Override
    public void undo(){
        this.tv.turnOn();
    }
}
