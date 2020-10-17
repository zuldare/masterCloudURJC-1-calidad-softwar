package usantatecla.mastermind.views.console;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.views.View;

public class ViewConsole extends View {

  private StartView startView;
  private ProposalView proposalView;
  private ResumeView resumeView;

  public ViewConsole(Game game){
    this.startView = new StartView();
    this.proposalView = new ProposalView(game);
    this.resumeView = new ResumeView(game);
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
