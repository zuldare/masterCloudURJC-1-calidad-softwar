package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.controllers.StartController;
import usantatecla.mastermind.views.View;

public class ViewConsole extends View {

  private StartView startView;
  private ProposalView proposalView;
  private ResumeView resumeView;

  public ViewConsole(){
    this.startView = new StartView();
    this.proposalView = new ProposalView();
    this.resumeView = new ResumeView();
  }

  @Override
  public void visit(StartController startController) {
    this.startView.interact(startController);
  }

  @Override
  public void visit(ProposalController proposalController) {
    this.proposalView.interact(proposalController);
  }

  @Override
  public void visit(ResumeController resumeController) {
    this.resumeView.interact(resumeController);
  }

}
