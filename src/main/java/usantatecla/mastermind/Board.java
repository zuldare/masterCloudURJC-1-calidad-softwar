package usantatecla.mastermind;

public class Board {

  private static final Integer MAX_PLAYS = 10;
  private int attemp;

  private final SecretCombination secretCombination;
  private final ProposedCombination[] proposedCombinations;
  private final Result[] results;

  Board() {
    this.secretCombination = new SecretCombination();
    this.proposedCombinations = new ProposedCombination[MAX_PLAYS];
    this.results = new Result[MAX_PLAYS];
    this.attemp = 0;
  }

  void play() {

    this.secretCombination.writeCombination();
    ProposedCombination proposedCombination;
    usantatecla.mastermind.utils.Console.instance().writeln(Message.ATTEMPT.getMessageAttempt(attemp));

    do {
      String readedCombination = usantatecla.mastermind.utils.Console.instance().readString(Message.PROPOSE_COMBINATION.getMessage()).toUpperCase();
      proposedCombination = new ProposedCombination(readedCombination);
    } while (proposedCombination.isCombinationWrong());

    this.proposedCombinations[attemp] = proposedCombination;
    this.results[attemp] = this.secretCombination.checkResultFromProposedCombination(this.proposedCombinations[attemp]);
    attemp++;
  }


  public boolean hasWinner() {
    return this.results[attemp-1].getBlacks() == SecretCombination.MAX_COLORS;
  }

  public boolean hasLooser() {
    return (attemp-1) == MAX_PLAYS;
  }
}
