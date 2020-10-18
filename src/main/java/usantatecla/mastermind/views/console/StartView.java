package usantatecla.mastermind.views.console;


import usantatecla.mastermind.controllers.StartController;

public class StartView {

  void interact(StartController startController){
    startController.start();
    MessageView.TITLE.writeln();
    new SecretCombinationView().writeln();
  }
}
