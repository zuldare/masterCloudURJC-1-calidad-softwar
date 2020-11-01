package usantatecla.mastermind.controllers;

import usantatecla.mastermind.enums.StateValue;
import usantatecla.mastermind.models.Session;

import java.util.Map;

public class Logic  {

  protected Session session;
  protected Map<StateValue, AceptorController> controllerDictionary;

  protected Logic(){
  }

  public AceptorController getController() {
    return this.controllerDictionary.get(this.session.getValueState());
  }
}
