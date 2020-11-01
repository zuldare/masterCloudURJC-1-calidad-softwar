package usantatecla.mastermind.distributed;

class MastermindServer {

    private DispatcherPrototype dispatcherPrototype;

    private MastermindServer() {
        this.dispatcherPrototype = new DispatcherPrototype();
        LogicServerImpl logic = new LogicServerImpl();
        logic.associateDispatchers(this.dispatcherPrototype);
    }

    private void serve() {
        this.dispatcherPrototype.serve();
    }

    public static void main(String[] args) {
        new MastermindServer().serve();
    }
}
