package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.utils.YesNoDialog;

public class ResumeView {

  void interact(ResumeController resumeController) {
    resumeController.resume(new YesNoDialog().read(MessageView.RESUME.getMessage()));
  }

}
