package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.models.State;

public abstract class Controller {

  protected Session session;

  Controller(Session session){
    this.session = session;
  }

}
