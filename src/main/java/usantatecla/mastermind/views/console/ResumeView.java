package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.utils.YesNoDialog;

public class ResumeView {

  boolean interact(ResumeController resumeController) {
    boolean newGame = new YesNoDialog().read();
    resumeController.resume(new YesNoDialog().read(MessageView.RESUME.toString()));
    return newGame;
  }


}
