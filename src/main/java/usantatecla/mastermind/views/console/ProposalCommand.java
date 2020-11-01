package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.models.ProposedCombination;

import static usantatecla.mastermind.views.console.MessageView.PROPOSE_COMMAND;

public class ProposalCommand extends ConsoleCommand{

    public ProposalCommand(ProposalController proposalController){
        super(PROPOSE_COMMAND.getMessage(), proposalController);
    }
    @Override
    public void execute() {
        ProposedCombination proposedCombination = new ProposedCombination();
        ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
        proposedCombinationView.read();
        this.proposalController.addProposedCombination(proposedCombination);
    }

    @Override
    public boolean isActive() {
        return true;
    }
}
