package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.InGameController;

import static usantatecla.mastermind.views.console.MessageView.PROPOSE_COMMAND;

public class ProposalCommand extends ConsoleCommand{

    private InGameController inGameController;
    public ProposalCommand(InGameController inGameController){
        super(PROPOSE_COMMAND.getMessage());
        this.inGameController = inGameController;
    }

    @Override
    public void execute() {
        inGameController.doAction();
    }

    @Override
    public boolean isActive() {
        return inGameController.isActive();
    }
}
