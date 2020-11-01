package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.models.State;

public abstract class ResumeController extends AceptorController{

  public ResumeController(Session session){
    super(session);
  }
  @Override
  public void accept(VisitorController visitorController) {
    visitorController.visit(this);
  }

  public abstract void resume(boolean newGame);

}
