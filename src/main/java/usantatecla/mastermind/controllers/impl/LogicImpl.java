package usantatecla.mastermind.controllers.impl;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.enums.StateValue;
import usantatecla.mastermind.models.SessionImpl;

import java.util.HashMap;

public class LogicImpl extends Logic {

    protected StartControllerImpl startControllerImpl;
    protected ProposalControllerImpl proposalControllerImpl;
    protected ResumeControllerImpl resumeControllerImpl;

    public LogicImpl(){
        this.session = new SessionImpl();
        this.startControllerImpl = new StartControllerImpl(this.session);
        this.proposalControllerImpl = new ProposalControllerImpl(this.session);
        this.resumeControllerImpl = new ResumeControllerImpl (this.session);

        this.controllerDictionary.put(StateValue.CLOSE, this.startControllerImpl);
        this.controllerDictionary.put(StateValue.OPEN, this.proposalControllerImpl);
        this.controllerDictionary.put(StateValue.FINISHED, this.resumeControllerImpl);
        this.controllerDictionary.put(StateValue.EXIT, null);
    }
}
