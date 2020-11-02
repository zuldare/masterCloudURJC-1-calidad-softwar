package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.views.console.StartView;

public class StartController extends Controller {

  public StartController(Session session){
    super(session);
  }

  public void doAction(){
    new StartView().write();
    this.session.next();
  }

}
