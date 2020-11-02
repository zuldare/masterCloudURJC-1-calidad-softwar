package usantatecla.mastermind;

import usantatecla.mastermind.controllers.Controller;
import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.controllers.StartController;
import usantatecla.mastermind.enums.StateValue;
import usantatecla.mastermind.models.Session;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.nonNull;

public class Mastermind {

	private Session session;
	private Map<StateValue, Controller> controllerMap;

	Mastermind(){
		this.session = new Session();
		this.controllerMap = new HashMap<>(createControllerDictionary());
	}

	private Map<StateValue, Controller> createControllerDictionary() {
		Map<StateValue, Controller> dictionary  = new HashMap<>();
		dictionary.put(StateValue.CLOSE, new StartController(this.session));
		dictionary.put(StateValue.OPEN, new ProposalController(this.session));
		dictionary.put(StateValue.FINISHED, new ResumeController(this.session));
		dictionary.put(StateValue.EXIT, null);
		return dictionary;
	}

	void play(){
		Controller controller;
		do {
			controller = this.controllerMap.get(this.session.getValueState());
			if ( nonNull(controller)){
				controller.doAction();
			}
		} while (nonNull(controller));
	}

	public static void main (String[] args){
		new Mastermind().play();
	}

}
