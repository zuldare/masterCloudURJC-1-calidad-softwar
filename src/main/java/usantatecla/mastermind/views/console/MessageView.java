package usantatecla.mastermind.views.console;

import usantatecla.utils.Console;

enum MessageView {
	ATTEMPTS("#attempts attempt(s): "),
	SECRET("*"),
	RESUME("Do you want to continue"),
	RESULT(" --> #blacks blacks and #whites whites"),
	PROPOSED_COMBINATION("Propose a combination: "),
	TITLE("----- MASTERMIND -----"),
	WINNER("You've won!!! ;-)"),
	LOOSER("You've lost!!! :-("),
	PROPOSE_COMMAND("Propose: "),
	REDO_COMMAND("Redo previous proposal"),
	UNDO_COMMAND("Undo previos proposal");

	private String message;
	
	private Console console;
	
	MessageView(String message) {
			if (this.console == null) {
				this.console = Console.instance();
			}
		this.message = message;
	}

	void write() {
		this.console.write(this.message);
	}

	void writeln() {
		this.console.writeln(this.message);
	}

	void writeln(int attempts) {
		this.console.writeln(this.message.replaceAll("#attempts", "" + attempts));
	}

	void writeln(int blacks, int whites) {
		this.console.writeln(this.message.replaceFirst("#blacks", "" + blacks).replaceFirst("#whites", "" + whites));
	}

	public String getMessage() {
		return this.message;
	}
}
