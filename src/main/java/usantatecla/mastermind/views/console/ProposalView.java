package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.utils.WithConsoleView;

public class ProposalView extends WithConsoleView  {

  private SecretCombinationView secretCombinationView;

  ProposalView(){
    this.secretCombinationView = new SecretCombinationView();
  }

  boolean interact(ProposalController proposalController){
    new ProposalMenu(proposalController).execute();

    this.console.writeln();
    MessageView.ATTEMPTS.writeln(proposalController.getAttempts());
    this.secretCombinationView.writeln();
    for (int i = 0; i < proposalController.getAttempts(); i++) {
      new ProposedCombinationView(proposalController.getProposedCombination(i)).write();
      new ResultView(proposalController.getResult(i)).writeln();
    }
    if (proposalController.isWinner()) {
      MessageView.WINNER.writeln();
      return true;
    } else if (proposalController.isLooser()) {
      MessageView.LOOSER.writeln();
      return true;
    }
    return false;
  }

}
