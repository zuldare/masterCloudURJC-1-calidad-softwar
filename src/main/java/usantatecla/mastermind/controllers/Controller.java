package usantatecla.mastermind.controllers;

import usantatecla.mastermind.enums.StateValue;
import usantatecla.mastermind.models.Session;

public abstract class Controller {

  protected Session session;

  Controller(Session session){
    this.session = session;
  }

  public StateValue getValueState() {
    return this.session.getValueState();
  }

}
