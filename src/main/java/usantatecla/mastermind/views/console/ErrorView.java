package usantatecla.mastermind.views.console;

import usantatecla.mastermind.models.Error;
import usantatecla.utils.WithConsoleView;

public class ErrorView extends WithConsoleView {

	private static final String[] MESSAGES = { 
			"Repeated colors",
			"Wrong colors, they must be: " + usantatecla.mastermind.views.console.ColorView.allInitials(),
			"Wrong proposed combination length" };

	private Error error;

	public ErrorView(Error error) {
		this.error = error;
	}
	
	public void writeln() {
		this.console.writeln(ErrorView.MESSAGES[this.error.ordinal()]);
	}

}
