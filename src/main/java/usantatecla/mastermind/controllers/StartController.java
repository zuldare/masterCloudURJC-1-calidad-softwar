package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public abstract class StartController extends AceptorController{

  public StartController(Session session){
    super(session);
  }

  public void accept(VisitorController visitorController) {
    visitorController.visit(this);
  }

  public abstract void start();
}
