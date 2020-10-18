package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.utils.YesNoDialog;

public class ResumeView {

  private final ResumeController resumeController;

  ResumeView(ResumeController resumeController) {
    this.resumeController = resumeController;
  }

  boolean interact() {
    MessageView.RESUME.write();
    boolean newGame = new YesNoDialog().read();
    if (newGame) {
      this.resumeController.clear();
    }
    return newGame;
  }


}
