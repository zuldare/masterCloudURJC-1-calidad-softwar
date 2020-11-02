package usantatecla.mastermind.views.console;

import usantatecla.mastermind.models.Color;
import usantatecla.utils.WithConsoleView;

public class ColorView extends WithConsoleView{
	
	private static final char[] INITIALS = {'r', 'b', 'y', 'g', 'o', 'p'};

	private Color color;

	ColorView(Color color) {
		this.color = color;
	}

	static String allInitials() {
		String result = "";
		for(char character: ColorView.INITIALS) {
			result += character;
		}
		return result;
	}

	public static Color getInstance(char character) {
		for (int i = 0; i < ColorView.INITIALS.length; i++) {
			if (ColorView.INITIALS[i] == character) {
				return Color.values()[i];
			}
		}
		return null;
	}
	
	void write() {
		this.console.write(ColorView.INITIALS[this.color.ordinal()]);
	}

}
