package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.utils.YesNoDialog;

public class ResumeView {

  void interact(ResumeController resumeController) {
    boolean newGame = new YesNoDialog().read();

    if (newGame) {
      resumeController.resume();
    } else {
      resumeController.next();
    }
  }


}
