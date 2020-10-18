package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.State;

public class ResumeController extends Controller {

  public ResumeController(Game game, State state) {
    super(game, state);
  }

  public void clear(){
    this.game.clear();
  }

  public void resume(boolean isNewGame){
    if(!isNewGame){
      this.state.next();
    } else {
      this.state.initialize();
      this.game.clear();
    }
  }
}
