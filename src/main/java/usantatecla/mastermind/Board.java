package usantatecla.mastermind;

import usantatecla.utils.Console;

class Board {

  private static final Integer MAX_PLAYS = 10;
  private int attemp;

  private SecretCombination secretCombination;
  private ProposedCombination[] proposedCombinations;
  private Result[] results;

  Board() {
    this.secretCombination = new SecretCombination();
    this.proposedCombinations = new ProposedCombination[MAX_PLAYS];
    this.results = new Result[MAX_PLAYS];
    this.attemp = 0;
  }

  void play() {
    this.writeAttempInfo();
    ProposedCombination proposedCombination = this.makeACombinationGuess();
    this.storeCombinationGuess(proposedCombination);
  }

  private void storeCombinationGuess(ProposedCombination proposedCombination) {
    this.proposedCombinations[attemp] = proposedCombination;
    this.results[attemp] = this.secretCombination.checkResultFromProposedCombination(this.proposedCombinations[attemp]);
    attemp++;
  }

  private ProposedCombination makeACombinationGuess() {
    ProposedCombination proposedCombination;
    do {
      proposedCombination = new ProposedCombination();
      proposedCombination.setColorsFromCombination();
    } while (proposedCombination.isCombinationWrong());
    return proposedCombination;
  }

  private void writeAttempInfo(){
    this.secretCombination.writeCombination();
    for(int i=0; i < attemp; i++){
       this.results[i].write(this.proposedCombinations[i].getProposedCombinationAsString());
    }
    Console.instance().writeln(Message.ATTEMPT.getMessageAttempt(attemp));
  }

  boolean hasWinner() {
    return this.results[attemp-1].getBlacks() == SecretCombination.MAX_COLORS;
  }

  boolean hasLooser() {
    return (attemp-1) == MAX_PLAYS;
  }
}
