package usantatecla.mastermind;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.views.View;
import usantatecla.mastermind.views.console.ViewConsole;

public class MastermindConsole extends Mastermind {

  @Override
  protected View createView(Logic logic) {
    return new ViewConsole(logic);
  }

  public static void main(String[] args){
    new MastermindConsole().play();
  }
}