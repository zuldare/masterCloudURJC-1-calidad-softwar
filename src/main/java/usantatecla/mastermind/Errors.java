package usantatecla.mastermind;

public enum Errors {
  WRONG_LENGHT("Wrong proposed combination length");

  private String message;

  Errors(String message) {
    this.message = message;
  }

  public String getMessage(){
    return this.message;
  }
}
