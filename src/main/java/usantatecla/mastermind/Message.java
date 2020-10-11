package usantatecla.mastermind;

enum Message {
  TITLE("----- MASTERMIND ------"),
  SECRET_COMBINATION(" ****** - #combination"),
  PROPOSE_COMBINATION("Propose a combination: "),
  RESULT_COMBINATION("#combination --> #blacks blacks and #whites whites"),
  ATTEMPT(" #attempt attempt(s): "),
  WIN("You've won!!! ;-)"),
  LOOSE("You've lost!!! :-("),
  RESUME("RESUME: ");

  private String message;

  Message(String message) {
    this.message = message;
  }

  public String getMessage(){
    return this.message;
  }

  public String getMessageSecretCombination(String combination) {
    assert this == Message.SECRET_COMBINATION;
    return this.getMessage().replaceFirst("#combination", combination);
  }

  public String getMessageAttempt(int attempt){
    assert this == Message.ATTEMPT;
    return this.getMessage().replaceFirst("#attempt", String.valueOf(attempt));
  }

  public String getResultCombination(String combination, int blacks, int whites){
    assert this == Message.RESULT_COMBINATION;
    return this.getMessage()
        .replaceFirst("#combination", String.valueOf(combination))
        .replaceFirst("#blacks", String.valueOf(blacks))
        .replaceFirst("#whites", String.valueOf(whites));
  }
}
