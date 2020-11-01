package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public abstract class UseCaseController extends Controller {

    protected Session session;

    UseCaseController(Session session){
        super(session);
    }

}
