package usantatecla.mastermind.controllers;

import java.util.HashMap;
import java.util.Map;
import usantatecla.mastermind.enums.StateValue;
import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.models.State;

public class Logic  {

  private Session session;
  private Map<StateValue, AceptorController> controllerDictionary;

  public Logic(){
    this.session = new Session();
    this.controllerDictionary = new HashMap<>();
  }

  private Map<StateValue, Controller> createControllerDictionary() {
    Map<StateValue, Controller> dictionary  = new HashMap<>();
    dictionary.put(StateValue.CLOSE, new StartController(this.session));
    dictionary.put(StateValue.OPEN, new ProposalController(this.session));
    dictionary.put(StateValue.FINISHED, new ResumeController(this.session));
    dictionary.put(StateValue.EXIT, null);
    return dictionary;
  }

  public AceptorController getController() {
    return this.controllerDictionary.get(this.session.getValueState());
  }
}
