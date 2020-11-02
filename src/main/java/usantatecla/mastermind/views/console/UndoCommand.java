package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.InGameController;

import static usantatecla.mastermind.views.console.MessageView.UNDO_COMMAND;

public class UndoCommand extends ConsoleCommand {

    private  InGameController inGameController;

    public UndoCommand(InGameController inGameController) {
        super(UNDO_COMMAND.getMessage());
        this.inGameController = inGameController;
    }

    @Override
    public void execute() {
        this.inGameController.doAction();
    }

    @Override
    public boolean isActive() {
        return this.inGameController.isActive();
    }
}
