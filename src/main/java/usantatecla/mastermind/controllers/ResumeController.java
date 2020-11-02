package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.views.console.ResumeView;

public class ResumeController extends Controller {

  public ResumeController(Session session) {
    super(session);
  }

  public void doAction(){
    boolean newGame = new ResumeView().read();

    if (newGame) {
      this.session.clear();
    } else {
      this.session.next();
    }
  }
}
