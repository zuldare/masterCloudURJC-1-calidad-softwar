package usantatecla.mastermind.models;

import usantatecla.mastermind.enums.StateValue;

public class State {

  private StateValue stateValue;

  public State(){
    this.initialize();
  }

  public void initialize(){
    this.stateValue = StateValue.CLOSE;
  }

  public void next(){
    this.stateValue = StateValue.values()[this.stateValue.ordinal()+1];
  }
  public StateValue getStateValue() {
    return this.stateValue;
  }
}
