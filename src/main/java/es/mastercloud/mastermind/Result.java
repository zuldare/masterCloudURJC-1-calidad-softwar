package es.mastercloud.mastermind;

import es.mastercloud.utils.Console;

class Result {

  private int blacks = 0;
  private int whites = 0;

  Result(int blacks, int whites) {
    this.blacks = blacks;
    this.whites = whites;
  }

  int getBlacks(){
    return this.blacks;
  }


  void write(String combination) {
    Console.instance().writeln(Message.RESULT_COMBINATION.getResultCombination(combination, this.blacks, this.whites));
  }
}
