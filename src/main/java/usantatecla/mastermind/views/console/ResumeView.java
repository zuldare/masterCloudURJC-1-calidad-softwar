package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.utils.YesNoDialog;

public class ResumeView {

  private Logic logic;

  ResumeView(Logic logic) {
    this.logic = logic;
  }

  boolean interact() {
    MessageView.RESUME.write();
    boolean newGame = new YesNoDialog().read();
    if (newGame) {
      this.logic.clear();
    }
    return newGame;
  }


}
