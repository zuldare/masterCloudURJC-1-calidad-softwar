package usantatecla.mastermind;

import usantatecla.mastermind.controllers.AceptorController;
import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.views.View;

import static java.util.Objects.nonNull;

public abstract class Mastermind {

	private Logic logic;
 	private View view;


	protected Mastermind(){
 		this.logic = this.createLogic();
		this.view = this.createView();
	}

	protected abstract View createView();
	protected abstract Logic createLogic();

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
