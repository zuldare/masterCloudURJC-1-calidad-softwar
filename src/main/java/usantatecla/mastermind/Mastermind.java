package usantatecla.mastermind;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.controllers.StartController;
import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.views.View;
import usantatecla.mastermind.views.console.ViewConsole;

public abstract class Mastermind {

 	private View view;
	private StartController startController;
	private ProposalController proposalController;
	private ResumeController resumeController;
	protected Mastermind(){
		Game game = new Game();
		this.startController = new StartController(game);
		this.proposalController = new ProposalController(game);
		this.resumeController = new ResumeController(game);
		this.view = this.createView(startController, proposalController, resumeController);
	}

	protected abstract View createView(StartController startController, ProposalController proposalController, ResumeController resumeController);

	protected void play(){
		this.view.interact();
	}

}
