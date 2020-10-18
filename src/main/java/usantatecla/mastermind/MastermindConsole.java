package usantatecla.mastermind;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.controllers.StartController;
import usantatecla.mastermind.views.View;
import usantatecla.mastermind.views.console.ViewConsole;

public class MastermindConsole extends Mastermind {

  @Override
  protected View createView(StartController startController, ProposalController proposalController, ResumeController resumeController) {
    return new ViewConsole(startController, proposalController, resumeController);
  }

  public static void main(String[] args){
    new MastermindConsole().play();
  }
}