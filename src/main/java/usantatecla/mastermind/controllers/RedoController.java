package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.models.SessionImpl;

public class RedoController extends Controller {

    private SessionImpl session;

    public RedoController(Session session){
        super(session);
        this.session = (SessionImpl) session;
    }

    public void redo(){
        this.session.redo();
    }

    public boolean isRedoable(){
        return this.session.isRedoable();
    }

}
