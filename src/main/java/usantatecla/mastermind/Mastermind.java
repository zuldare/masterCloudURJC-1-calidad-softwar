package usantatecla.mastermind;

import usantatecla.utils.Console;
import usantatecla.utils.YesNoDialog;

public class Mastermind {

  private Board board;

  public void play(){
    do {
      playMastermind();
    } while (this.resumeGame());
  }

  private void playMastermind(){
    Console.instance().writeln(Message.TITLE.getMessage());
    this.board = new Board();
    do {
      this.board.play();
    } while (!this.board.hasWinner() && !this.board.hasLooser());
    Message message = this.board.hasLooser() ? Message.LOOSE : Message.WIN;
    Console.instance().writeln(message.getMessage());
  }

  private boolean resumeGame(){
    return new YesNoDialog().read(Message.RESUME.getMessage());
  }

}
