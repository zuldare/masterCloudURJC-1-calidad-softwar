package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.State;

public class StartController extends Controller {

  public StartController(Game game, State state) {
    super(game, state);
  }

  @Override
  public void accept(VisitorController visitorController) {
    visitorController.visit(this);
  }

  public void start(){
    this.state.next();
  }

}
