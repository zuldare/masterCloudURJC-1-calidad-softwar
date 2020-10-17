package usantatecla.mastermind.views.console;

import usantatecla.mastermind.models.Game;
import usantatecla.utils.YesNoDialog;

public class ResumeViewConsole {

  private Game game;

  ResumeViewConsole(Game game){
    this.game = game;
  }

  boolean interact(){
    MessageView.RESUME.write();
    boolean newGame = new YesNoDialog().read();
    if (newGame) {
      this.game.clear();
    }
    return newGame;
  }

}
