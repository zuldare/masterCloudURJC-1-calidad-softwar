package usantatecla.mastermind.views.console;

public class StartViewConsole {
  StartViewConsole(){
  }

  void interact(){
    MessageView.TITLE.writeln();
    new SecretCombinationView().writeln();
  }
}
