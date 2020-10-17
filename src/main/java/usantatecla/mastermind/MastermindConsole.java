package usantatecla.mastermind;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.views.View;
import usantatecla.mastermind.views.console.ViewConsole;

public class MastermindConsole extends Mastermind {

  @Override
  protected View createView(Game game) {
    return new ViewConsole(game);
  }

  public static void main(String[] args){
    new MastermindConsole().play();
  }
}