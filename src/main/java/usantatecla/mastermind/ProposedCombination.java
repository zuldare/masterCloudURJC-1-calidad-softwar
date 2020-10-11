package usantatecla.mastermind;

public class ProposedCombination extends Combination {

  public ProposedCombination(){
    super();
    this.setProposedCombination();
  }

  public String getProposedCombinationAsString(){
    return this.colorsToString();
  }

  public Color[] getProposedCombination(){
    return this.colors;
  }

  private void setProposedCombination(){
    String combination = "";
    do {
      combination = usantatecla.mastermind.utils.Console.instance().readString(Message.PROPOSE_COMBINATION.getMessage()).toUpperCase();
    } while (!this.isCombinationValid(combination));
  }

  private boolean isCombinationValid(String combination){
     return this.isCombinationLengthValid(combination) && this.isAllCombinationColorsValid(combination);
  }

  private boolean isCombinationLengthValid(String combination){
    return combination.length() == Combination.MAX_COLORS;
  }

  private boolean isAllCombinationColorsValid(String combination){
     for (int i=0; i< combination.length(); i++){
       if ( Color.getColorBySymbol(String.valueOf(combination.charAt(i))) == null) return false;
     }
     return true;
  }

  @Override
  public void writeCombination() {

  }
}
