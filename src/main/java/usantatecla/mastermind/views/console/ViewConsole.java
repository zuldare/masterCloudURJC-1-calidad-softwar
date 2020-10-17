package usantatecla.mastermind.views.console;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.views.View;

public class ViewConsole extends View {

  private StartViewConsole startViewConsole;
  private ProposalViewConsole proposalViewConsole;
  private ResumeViewConsole resumeViewConsole;

  public ViewConsole(Game game){
    this.startViewConsole = new StartViewConsole();
    this.proposalViewConsole = new ProposalViewConsole(game);
    this.resumeViewConsole = new ResumeViewConsole(game);
  }

  @Override
  protected void start() {
    this.startViewConsole.interact();
  }

  @Override
  protected boolean propose() {
    return this.proposalViewConsole.interact();
  }

  @Override
  protected boolean resume() {
    return this.resumeViewConsole.interact();
  }
}
