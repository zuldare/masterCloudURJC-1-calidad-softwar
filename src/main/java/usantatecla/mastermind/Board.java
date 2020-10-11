package usantatecla.mastermind;

public class Board {

  private static final Integer MAX_PLAYS = 10;
  private int attemp;

  private SecretCombination secretCombination;
  private ProposedCombination[] proposedCombinations;
  private Result[] results;

  Board(){
    this.secretCombination = new SecretCombination();
    this.proposedCombinations = new ProposedCombination[MAX_PLAYS];
    this.results = new Result[MAX_PLAYS];
    this.attemp = 0;
  }

  void play(){
    this.secretCombination.writeCombination();
    this.proposedCombinations[attemp] = new ProposedCombination();
    this.attemp++;
    this.results[attemp] = this.secretCombination.checkResultFromProposedCombination(this.proposedCombinations[attemp]);
  }


  public boolean hasWinner() {
    return this.results[attemp].getBlacks() == SecretCombination.MAX_COLORS;
  }

  public boolean hasLooser(){
    return attemp == MAX_PLAYS;
  }
}
