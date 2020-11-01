package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.models.State;

public class ResumeController extends Controller implements AceptorController{

  public ResumeController(Session session) {
    super(session);
  }


  public void accept(VisitorController visitorController) {
    visitorController.visit(this);
  }

  public void resume(){
    this.session.clear();
  }
}
