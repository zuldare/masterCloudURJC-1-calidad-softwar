package usantatecla.mastermind;

public class Mastermind {

  private Board board;

  public void play(){
    do {
      playMastermind();
    } while (this.resumeGame());
  }

  private void playMastermind(){
    usantatecla.mastermind.utils.Console.instance().writeln(Message.TITLE.getMessage());
    this.board = new Board();
    do {
      this.board.play();
    } while (!this.board.hasWinner() && !this.board.hasLooser());
    Message message = this.board.hasLooser() ? Message.LOOSE : Message.WIN;
    usantatecla.mastermind.utils.Console.instance().writeln(message.getMessage());
  }

  private boolean resumeGame(){
    return new usantatecla.mastermind.utils.YesNoDialog().read(Message.RESUME.getMessage());
  }

}
