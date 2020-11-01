package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.*;

public abstract class ProposalController extends AceptorController {

  public ProposalController(Session session) {
    super(session);
  }

  public abstract void addProposedCombination(ProposedCombination proposedCombination);

  public abstract boolean isLooser();

  public abstract boolean isWinner();

  public abstract int getAttempts();

  public abstract ProposedCombination getProposedCombination(int position);

  public abstract Result getResult(int position);

  public abstract void undo();

  public abstract boolean isUndoable();

  public abstract void redo();

  public abstract boolean isRedoable();

  public abstract void next();

  public void accept(VisitorController visitorController) {
    visitorController.visit(this);
  }

}
