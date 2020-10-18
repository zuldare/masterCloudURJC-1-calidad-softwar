package usantatecla.mastermind.views;

import usantatecla.mastermind.controllers.Logic;

public abstract class View {

	private Logic logic;

	public View(Logic logic){
		this.logic = logic;
	}

	public void interact() {
		boolean newGame;
		do {
			this.start();
			boolean finished;
			do {
				finished = this.propose();
			} while (!finished);
			newGame = this.resume();
		} while (newGame);
	}

	protected abstract void start();
	protected abstract boolean propose();
	protected abstract boolean resume();
}
