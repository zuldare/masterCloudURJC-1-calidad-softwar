package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.views.console.ConsoleMenu;
import usantatecla.mastermind.views.console.ProposalCommand;
import usantatecla.mastermind.views.console.RedoCommand;
import usantatecla.mastermind.views.console.UndoCommand;

public class ProposalController extends Controller {

  private ConsoleMenu consoleMenu;

  public ProposalController(Session session) {
    super(session);
    this.consoleMenu = new ConsoleMenu();
    this.consoleMenu.addCommand(new ProposalCommand(new ActionController(this.session)));
    this.consoleMenu.addCommand(new UndoCommand(new UndoController(this.session)));
    this.consoleMenu.addCommand(new RedoCommand(new RedoController(this.session)));
  }

  public void doAction(){
    this.consoleMenu.execute();
  }
}
