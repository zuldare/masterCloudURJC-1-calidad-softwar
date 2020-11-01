package usantatecla.mastermind.distributed;

import usantatecla.mastermind.Mastermind;
import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.distributed.proxy.LogicProxy;
import usantatecla.mastermind.views.View;
import usantatecla.mastermind.views.console.ViewConsole;

class MastermindClient extends Mastermind {

    protected Logic createLogic() {
        return new LogicProxy();
    }

    protected View createView() {
        return new ViewConsole();
    }

    public static void main(String[] args) {
        new MastermindClient().play();
    }
}
