package usantatecla.mastermind.views;

import usantatecla.mastermind.controllers.Controller;
import usantatecla.mastermind.controllers.VisitorController;

public abstract class View implements VisitorController {

	public void interact(Controller controller){
		controller.accept(this);
	}

}
