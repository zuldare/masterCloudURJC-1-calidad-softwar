package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.models.SessionImpl;

public class UndoController extends Controller {

    private SessionImpl session;
    public UndoController(Session session) {
        super(session);
        this.session = (SessionImpl) session;
    }

    public void undo(){
        this.session.undo();
    }

    public boolean isUndoable(){
        return this.session.isUndoable();
    }

}
