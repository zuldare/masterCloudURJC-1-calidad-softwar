package usantatecla.mastermind.controllers.impl;

import usantatecla.mastermind.controllers.StartController;
import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.models.SessionImpl;

public class StartControllerImpl extends StartController {

    private SessionImpl session;

    public StartControllerImpl(Session session) {
        super(session);
        this.session = (SessionImpl) session;
    }

    @Override
    public void start() {
        this.session.next();
    }
}
