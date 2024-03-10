package design.patterns.command;

import java.util.Stack;

public class Remote {
    Stack<ICommand> history;
    private ICommand command;

    public Remote() {
        history = new Stack<>();
    }

    public void pressButton() {
        command.execute();
        history.push(command);
    }

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void undo() {
        if (!history.isEmpty()) {
            ICommand lastCommand = history.pop();
            lastCommand.undo();
        }
    }
}
