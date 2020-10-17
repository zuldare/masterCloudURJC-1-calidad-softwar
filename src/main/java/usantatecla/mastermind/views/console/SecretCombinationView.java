package usantatecla.mastermind.views.console;

import usantatecla.mastermind.models.SecretCombination;
import usantatecla.utils.WithConsoleView;

public class SecretCombinationView extends WithConsoleView {

	SecretCombinationView() {
		super();
	}

	void writeln() {
		for (int i = 0; i < SecretCombination.getWidth(); i++) {
			MessageView.SECRET.write();
		}
		this.console.writeln();
	}

}
