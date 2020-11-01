package usantatecla.mastermind.controllers.impl;

import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.models.SessionImpl;

public class ResumeControllerImpl extends ResumeController  {

    private SessionImpl session;

    public ResumeControllerImpl(Session session) {
        super(session);
        this.session = (SessionImpl)session;
    }

    public void resume(boolean newGame) {
        if (newGame){
            this.session.clear();
        } else {
            this.session.next();
        }
    }
}
