package usantatecla.mastermind;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.views.console.ViewConsole;

public class MastermindForConsole {

	private Game game;
	private ViewConsole viewConsole;

	private MastermindForConsole() {
		this.game = new Game();
		this.viewConsole = new ViewConsole(game);
	}

	private void play() {
		this.viewConsole.interact();
	}
	
	public static void main(String[] args) {
		new MastermindForConsole().play();
	}	

}
