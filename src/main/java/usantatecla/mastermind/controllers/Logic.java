package usantatecla.mastermind.controllers;

import java.util.HashMap;
import java.util.Map;
import usantatecla.mastermind.enums.StateValue;
import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.models.State;

public class Logic  {

  protected Session session;
  protected Map<StateValue, AceptorController> controllerDictionary;

  protected Logic(){
  }

  public AceptorController getController() {
    return this.controllerDictionary.get(this.session.getValueState());
  }
}
