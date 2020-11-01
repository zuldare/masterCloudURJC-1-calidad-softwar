package usantatecla.mastermind.models;

public class Result {

	private int blacks = 0;

	private int whites = 0;

	public Result(int blacks, int whites) {
		assert blacks >= 0;
		assert whites >= 0;
		this.blacks = blacks;
		this.whites = whites;
	}

	public boolean isWinner() {
		return this.blacks == Combination.getWidth();
	}

	public int getBlacks() {
		return this.blacks;
	}

	public int getWhites() {
		return this.whites;
	}

}
