package usantatecla.mastermind.distributed.proxy;

import usantatecla.mastermind.controllers.StartController;
import usantatecla.mastermind.controllers.impl.FrameType;
import usantatecla.mastermind.distributed.TCPIP;
import usantatecla.mastermind.models.Session;

public class StartControllerProxy extends StartController {

    private  TCPIP tcpip;

    StartControllerProxy(Session session, TCPIP tcpip) {
        super(session);
        this.tcpip = tcpip;
    }

    @Override
    public void start() {
        this.tcpip.send(FrameType.START.name());
    }
}
