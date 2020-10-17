package usantatecla.mastermind.views.console;

public class StartView {
  StartView(){
  }

  void interact(){
    MessageView.TITLE.writeln();
    new SecretCombinationView().writeln();
  }
}
