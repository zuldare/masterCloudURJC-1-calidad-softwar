package usantatecla.mastermind;

import static java.util.Objects.nonNull;

import usantatecla.mastermind.controllers.AceptorController;
import usantatecla.mastermind.controllers.Controller;
import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.views.View;

public abstract class Mastermind {

 	private View view;
	private Logic logic;

	protected Mastermind(){
 		this.logic = new Logic();
		this.view = this.createView();
	}

	protected abstract View createView();

	protected void play(){
		AceptorController controller;
		do {
			controller = this.logic.getController();
			if ( nonNull(controller)){
				this.view.interact(controller);
			}
		} while (nonNull(controller));
	}

}
