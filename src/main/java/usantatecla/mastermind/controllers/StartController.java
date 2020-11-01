package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.models.State;

public abstract class StartController extends AceptorController{

  public StartController(Session session){
    super(session);
  }

  public void accept(VisitorController visitorController) {
    visitorController.visit(this);
  }

  public abstract void start();
}
