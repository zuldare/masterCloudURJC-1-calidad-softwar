package usantatecla.mastermind;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.controllers.impl.LogicImpl;
import usantatecla.mastermind.views.View;
import usantatecla.mastermind.views.console.ViewConsole;

public class MastermindConsole extends Mastermind {

  protected View createView() {
    return new ViewConsole();
  }

  protected Logic createLogic() {
    return new LogicImpl();
  }

  public static void main(String[] args){
    new MastermindConsole().play();
  }
}