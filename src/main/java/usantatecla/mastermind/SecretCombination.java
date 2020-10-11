package usantatecla.mastermind;

import java.util.Arrays;
import java.util.Random;

public class SecretCombination extends Combination {

  public SecretCombination(){
    super();
    this.setRandomColorToEachCombinationPosition();
  }

  private void setRandomColorToEachCombinationPosition() {
    for (int i = 0; i < MAX_COLORS; i++) {
      this.colors[i] = Color.getColor(this.getRandomNumberUsingNextInt(0, Color.values().length));
    }
  }

  private int getRandomNumberUsingNextInt(int min, int max) {
    Random random = new Random();
    return random.nextInt(max - min) + min;
  }

  @Override
  public void writeCombination() {
    usantatecla.mastermind.utils.Console.instance()
        .writeln(Message.SECRET_COMBINATION.getMessageSecretCombination(this.colorsToString()));
  }

  public Result checkResultFromProposedCombination(ProposedCombination proposedCombination){
    int blacks = 0;
    int whites = 0;

    blacks = getBlacks(proposedCombination, blacks);
    whites = getWhites(proposedCombination, whites);

    return new Result(blacks, whites - blacks);
  }

  private int getWhites(ProposedCombination proposedCombination, int whites) {
    for (int i=0; i< this.colors.length; i++){
       whites = whites + (Arrays.asList(this.colors).contains(proposedCombination.getProposedCombination()[i])?1:0);
    }
    return whites;
  }

  private int getBlacks(ProposedCombination proposedCombination, int blacks) {
    for (int i=0; i< this.colors.length; i++){
       blacks = blacks + (proposedCombination.getProposedCombination()[i] == this.colors[i] ? 1 : 0);
    }
    return blacks;
  }

}
