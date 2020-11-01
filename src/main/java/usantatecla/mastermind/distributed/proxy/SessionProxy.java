package usantatecla.mastermind.distributed.proxy;

import usantatecla.mastermind.controllers.impl.FrameType;
import usantatecla.mastermind.distributed.TCPIP;
import usantatecla.mastermind.enums.StateValue;
import usantatecla.mastermind.models.Session;

public class SessionProxy implements Session {

    private TCPIP tcpip;

    SessionProxy(TCPIP tcpip) {
        this.tcpip = tcpip;
    }

    @Override
    public StateValue getValueState() {
        this.tcpip.send(FrameType.STATE.name());
        return StateValue.values()[this.tcpip.receiveInt()];
    }
}
