package usantatecla.mastermind.distributed.proxy;

import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.controllers.impl.FrameType;
import usantatecla.mastermind.distributed.TCPIP;
import usantatecla.mastermind.models.Session;

public class ResumeControllerProxy extends ResumeController {

    private TCPIP tcpip;

    public ResumeControllerProxy(Session session, TCPIP tcpip) {
        super(session);
        this.tcpip = tcpip;
    }

    @Override
    public void resume(boolean newGame) {
        this.tcpip.send(FrameType.RESUME.name());
        this.tcpip.send(newGame);
    }
}
