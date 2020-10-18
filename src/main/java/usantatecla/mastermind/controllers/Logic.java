package usantatecla.mastermind.controllers;

import java.util.HashMap;
import java.util.Map;
import usantatecla.mastermind.enums.StateValue;
import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.State;

public class Logic  {

  private Game game;
  private State state;
  private Map<StateValue, Controller> controllerDictionary;

  public Logic(){
    this.state = new State();
    this.game = new Game();
    this.controllerDictionary = new HashMap<>(this.createControllerDictionary());
  }

  private Map<StateValue, Controller> createControllerDictionary() {
    Map<StateValue, Controller> dictionary  = new HashMap<>();
    dictionary.put(StateValue.CLOSE, new StartController(this.game, this.state));
    dictionary.put(StateValue.OPEN, new ProposalController(this.game, this.state));
    dictionary.put(StateValue.FINISHED, new ResumeController(this.game, this.state));
    dictionary.put(StateValue.EXIT, null);
    return dictionary;
  }

  public Controller getController(){
    return this.controllerDictionary.get(this.state.getStateValue());
  }
}
