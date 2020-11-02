package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.views.console.MessageView;
import usantatecla.mastermind.views.console.ProposedCombinationView;
import usantatecla.mastermind.views.console.ResultView;
import usantatecla.mastermind.views.console.SecretCombinationView;
import usantatecla.utils.Console;

public abstract class InGameController extends Controller {


    InGameController(Session session) {
        super(session);
    }

    protected abstract void inGameControl();

    public abstract boolean isActive();

    @Override
    public void doAction(){
        this.inGameControl();
        Console.instance().writeln();
        MessageView.ATTEMPTS.writeln(this.session.getAttempts());
        new SecretCombinationView().writeln();

        for (int i = 0; i < this.session.getAttempts(); i++) {
            new ProposedCombinationView(this.session.getProposedCombinationAt(i)).write();
            new ResultView(this.session.getResultAt(i)).writeln();
        }

        if (this.session.isWinner()) {
            MessageView.WINNER.writeln();
            this.session.next();
        } else if (this.session.isLooser()) {
            MessageView.LOOSER.writeln();
            this.session.next();
        }
    }
}
