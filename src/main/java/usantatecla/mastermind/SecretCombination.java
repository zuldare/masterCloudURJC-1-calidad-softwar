package usantatecla.mastermind;

import java.util.Random;
import usantatecla.utils.Console;

class SecretCombination extends Combination {

  public SecretCombination(){
    super();
    this.setRandomColorToEachCombinationPosition();
  }

  private void setRandomColorToEachCombinationPosition() {
    for (int i = 0; i < MAX_COLORS; i++) {
      this.colors.add(Color.getColor(this.getRandomNumberUsingNextInt(0, Color.values().length)));
    }
  }

  private int getRandomNumberUsingNextInt(int min, int max) {
    Random random = new Random();
    return random.nextInt(max - min) + min;
  }

  public void writeCombination() {
    StringBuffer sb = new StringBuffer("");
    for(Color color: colors){
      sb.append(color.getSymbol());
    }
    Console.instance().writeln(Message.SECRET_COMBINATION.getMessageSecretCombination(sb.toString()));
  }

  public Result checkResultFromProposedCombination(ProposedCombination proposedCombination){
    int blacks = 0;
    int whites = 0;

    blacks = getBlacks(proposedCombination, blacks);
    whites = getWhites(proposedCombination, whites);

    return new Result(blacks, whites - blacks);
  }

  private int getWhites(ProposedCombination proposedCombination, int whites) {
    for (int i=0; i< this.colors.size(); i++){
       whites = whites + (this.colors.contains(proposedCombination.getProposedCombination().get(i))?1:0);
    }
    return whites;
  }

  private int getBlacks(ProposedCombination proposedCombination, int blacks) {
    for (int i=0; i< this.colors.size(); i++){
       blacks = blacks + (proposedCombination.getProposedCombination().get(i) == this.colors.get(i) ? 1 : 0);
    }
    return blacks;
  }

}
