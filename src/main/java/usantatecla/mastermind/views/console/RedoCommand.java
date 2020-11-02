package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.InGameController;

import static usantatecla.mastermind.views.console.MessageView.REDO_COMMAND;

public class RedoCommand extends ConsoleCommand{

    private InGameController inGameController;
    public RedoCommand(InGameController inGameController){
        super(REDO_COMMAND.getMessage());
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
