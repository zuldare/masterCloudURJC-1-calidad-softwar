package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.models.State;

public class StartController extends Controller implements AceptorController{

  StartController(Session session){
    super(session);
  }

  @Override
  public void accept(VisitorController visitorController) {
    visitorController.visit(this);
  }


}
