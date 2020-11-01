package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.*;

public class ProposalController extends Controller implements AceptorController {

  private ActionController actionController;
  private UndoController undoController;
  private RedoController redoController;

  public ProposalController(Session session) {
    super(session);
    this.actionController = new ActionController(this.session);
    this.undoController = new UndoController(this.session);
    this.redoController = new RedoController(this.session);
  }

  @Override
  public void accept(VisitorController visitorController) {
    visitorController.visit(this);
  }

  public void addProposedCombination(ProposedCombination proposedCombination) {
    this.actionController.addProposedCombination(proposedCombination);
  }

  public int getAttempts() {
    return this.actionController.getAttempts();
  }

  public ProposedCombination getProposedCombination(int position) {
    return this.actionController.getProposedCombinationAt(position);
  }

  public Result getResult(int position) {
    return this.actionController.getResultAt(position);
  }

  public boolean isWinner() {
    return this.actionController.isWinner();
  }

  public boolean isLooser() {
    return this.actionController.isLooser();
  }

  public void redo(){
    this.redoController.redo();
  }

  public boolean isRedoable(){
    return this.redoController.isRedoable();
  }

  public void undo(){
    this.undoController.undo();
  }

  public boolean isUndoable(){
    return this.undoController.isUndoable();
  }

}
