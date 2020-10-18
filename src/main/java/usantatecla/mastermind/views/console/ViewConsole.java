package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.views.View;

public class ViewConsole extends View {

  private StartView startView;
  private ProposalView proposalView;
  private ResumeView resumeView;

  public ViewConsole(Logic logic){
    super(logic);
    this.startView = new StartView();
    this.proposalView = new ProposalView(logic);
    this.resumeView = new ResumeView(logic);
  }

  @Override
  protected void start() {
    this.startView.interact();
  }

  @Override
  protected boolean propose() {
    return this.proposalView.interact();
  }

  @Override
  protected boolean resume() {
    return this.resumeView.interact();
  }
}
