package usantatecla.mastermind.views.console;


public class StartView {

  public void write() {
    MessageView.TITLE.writeln();
    new SecretCombinationView().writeln();
  }

}
