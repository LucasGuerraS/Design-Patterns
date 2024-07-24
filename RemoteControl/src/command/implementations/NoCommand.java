package command.implementations;

import command.interfaces.Command;

public class NoCommand implements Command {
    public void execute() {}

    public void undo() {}
}
