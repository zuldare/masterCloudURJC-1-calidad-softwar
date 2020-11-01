package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.*;
import usantatecla.mastermind.views.View;

public class ViewConsole extends View implements VisitorController {

  private StartView startView;
  private ProposalView proposalView;
  private ResumeView resumeView;

  public ViewConsole(){
    this.startView = new StartView();
    this.proposalView = new ProposalView();
    this.resumeView = new ResumeView();
  }

  public void visit(StartController startController) {
    this.startView.interact(startController);
  }

  public void visit(ProposalController proposalController) {
    this.proposalView.interact(proposalController);
  }

  public void visit(ResumeController resumeController) {
    this.resumeView.interact(resumeController);
  }

  @Override
  public void interact(AceptorController aceptorController) {
    aceptorController.accept(this);
  }
}
