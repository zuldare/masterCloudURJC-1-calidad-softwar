package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;

import static usantatecla.mastermind.views.console.MessageView.UNDO_COMMAND;

public class UndoCommand extends ConsoleCommand {

    UndoCommand(ProposalController proposalController){
        super(UNDO_COMMAND.getMessage(), proposalController);
    }

    @Override
    public void execute() {
        this.proposalController.undo();
    }

    @Override
    public boolean isActive() {
        return this.proposalController.isUndoable();
    }
}
