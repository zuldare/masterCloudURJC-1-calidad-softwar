package usantatecla.mastermind;

import usantatecla.utils.Console;

class Result {

  private int blacks = 0;
  private int whites = 0;

  public Result(int blacks, int whites) {
    this.blacks = blacks;
    this.whites = whites;
  }

  public int getBlacks(){
    return this.blacks;
  }


  public void write(String combination) {
    Console.instance().writeln(Message.RESULT_COMBINATION.getResultCombination(combination, this.blacks, this.whites));
  }
}
