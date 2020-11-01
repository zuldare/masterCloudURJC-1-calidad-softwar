package usantatecla.mastermind.distributed.proxy;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.distributed.TCPIP;
import usantatecla.mastermind.enums.StateValue;

public class LogicProxy extends Logic {

    private TCPIP tcpip;

    public LogicProxy() {
        this.tcpip = TCPIP.createClientSocket();
        this.session = new SessionProxy(this.tcpip);
        this.controllerDictionary.put(StateValue.CLOSE, new StartControllerProxy(this.session, this.tcpip));
        this.controllerDictionary.put(StateValue.OPEN, new ProposalControllerProxy(this.session, this.tcpip));
        this.controllerDictionary.put(StateValue.FINISHED, new ResumeControllerProxy(this.session, this.tcpip));
        this.controllerDictionary.put(StateValue.EXIT, null);
    }
}
