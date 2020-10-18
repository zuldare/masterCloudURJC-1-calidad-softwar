package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.models.Result;

public class Logic  {

  private ProposalController proposalController;
  private ResumeController resumeController;

  public Logic(){
    Game game = new Game();
    this.proposalController = new ProposalController(game);
    this.resumeController = new ResumeController(game);
  }


  public void addProposedCombination(ProposedCombination proposedCombination) {
    this.proposalController.addProposedCombination(proposedCombination);
  }

  public int getAttempts() {
    return this.proposalController.getAttempts();
  }

  public ProposedCombination getProposedCombination(int position) {
    return this.proposalController.getProposedCombination(position);
  }

  public Result getResult(int position) {
    return this.proposalController.getResult(position);
  }

  public boolean isWinner() {
    return this.proposalController.isWinner();
  }

  public boolean isLooser() {
    return this.proposalController.isLooser();
  }


  public void clear(){
    this.resumeController.clear();
  }
}
