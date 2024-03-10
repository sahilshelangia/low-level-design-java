package design.patterns.command;

public class TurnTVOffCommand implements ICommand{
    private TV tv;

    public TurnTVOffCommand(TV tv) {
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
