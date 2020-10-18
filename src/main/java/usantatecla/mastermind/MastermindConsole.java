package usantatecla.mastermind;

import usantatecla.mastermind.views.View;
import usantatecla.mastermind.views.console.ViewConsole;

public class MastermindConsole extends Mastermind {

  @Override
  protected View createView() {
    return new ViewConsole();
  }

  public static void main(String[] args){
    new MastermindConsole().play();
  }
}