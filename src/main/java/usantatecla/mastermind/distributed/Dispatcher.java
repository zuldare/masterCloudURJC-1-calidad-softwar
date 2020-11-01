package usantatecla.mastermind.distributed;


import usantatecla.mastermind.controllers.AceptorController;

public abstract class Dispatcher {

    protected AceptorController aceptorController;
    protected TCPIP tcpip;

    public Dispatcher(AceptorController acceptorController) {
        this.aceptorController = acceptorController;
    }

    public abstract void dispatch();

    public void associate(TCPIP tcpip) {
        this.tcpip = tcpip;
    }

}
