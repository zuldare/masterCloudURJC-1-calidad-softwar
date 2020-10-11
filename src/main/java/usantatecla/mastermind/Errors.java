package usantatecla.mastermind;

enum Errors {
  WRONG_LENGHT("Wrong proposed combination length"),
  WRONG_COLORS("Wrong colors, they must be #colorsCombination");

  private String message;

  Errors(String message) {
    this.message = message;
  }

  String getMessage(){
    return this.message;
  }

  String getWrongColorMessage(String colorsCombination){
    assert this == Errors.WRONG_COLORS;
    return Errors.WRONG_COLORS.getMessage().replaceFirst("#colorsCombination", colorsCombination);
  }
}
