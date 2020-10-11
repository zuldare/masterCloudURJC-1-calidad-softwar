package usantatecla.mastermind;

import java.util.List;

public class ProposedCombination extends Combination {

  public ProposedCombination(String readedCombination){
    super();
    this.setColorsFromCombination(readedCombination);
  }

  public List<Color> getProposedCombination(){
    return this.colors;
  }

  private void setColorsFromCombination(String readedCombination){

    for (int i=0; i< readedCombination.length(); i++){
      this.colors.add(Color.getColorBySymbol(String.valueOf(readedCombination.charAt(i)).toUpperCase()));
    }
  }

  public boolean isCombinationWrong(){
    return ! (this.isCombinationLengthValid() && this.isAllColorCombinationsValid());
  }

  private boolean isCombinationLengthValid(){
    if (this.colors.size() != Combination.MAX_COLORS) {
      usantatecla.mastermind.utils.Console.instance().writeln(Errors.WRONG_LENGHT.getMessage());
      return false;
    }
    return true;
  }

  private boolean isAllColorCombinationsValid() {
    for (Color color: this.colors){
       if (Color.getColorBySymbol(color.getSymbol()) == null){
         usantatecla.mastermind.utils.Console.instance().writeln(Errors.WRONG_COLORS.getWrongColorMessage(Color.getAllSymbols()));
         return false;
       }
    }
    return true;
  }

}
