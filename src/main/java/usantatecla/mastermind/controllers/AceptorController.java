package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public abstract class AceptorController extends Controller{

     AceptorController(Session session){
          super(session);
     }

     public abstract void accept(VisitorController visitorController);
}
