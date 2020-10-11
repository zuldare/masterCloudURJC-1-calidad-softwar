package usantatecla.mastermind;

import java.util.List;
import usantatecla.utils.Console;

class ProposedCombination extends Combination {

  List<Color> getProposedCombination(){
    return this.colors;
  }

  String getProposedCombinationAsString(){
    StringBuffer sb = new StringBuffer("");
    for(Color color: colors){
      sb.append(color.getSymbol());
    }
    return sb.toString();
  }

  void setColorsFromCombination(){
    String readedCombination = Console.instance().readString(Message.PROPOSE_COMBINATION.getMessage()).toUpperCase();
    for (int i=0; i< readedCombination.length(); i++){
      this.colors.add(Color.getColorBySymbol(String.valueOf(readedCombination.charAt(i)).toUpperCase()));
    }
  }

  boolean isCombinationWrong(){
    return ! (this.isCombinationLengthValid() && this.isAllColorCombinationsValid());
  }

  private boolean isCombinationLengthValid(){
    if (this.colors.size() != Combination.MAX_COLORS) {
      Console.instance().writeln(Errors.WRONG_LENGHT.getMessage());
      return false;
    }
    return true;
  }

  private boolean isAllColorCombinationsValid() {
    for (Color color: this.colors){

      if (color == null || Color.getColorBySymbol(color.getSymbol()) == null){
         Console.instance().writeln(Errors.WRONG_COLORS.getWrongColorMessage(Color.getAllSymbols()));
         return false;
       }
    }
    return true;
  }

}
