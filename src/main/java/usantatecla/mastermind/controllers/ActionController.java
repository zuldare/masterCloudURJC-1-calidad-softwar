package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.models.Result;
import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.models.SessionImpl;

public class ActionController extends Controller {

    private SessionImpl session;

    public ActionController(Session session) {
        super(session);
        this.session = (SessionImpl) session;
    }

    public void addProposedCombination(ProposedCombination proposedCombination){
        session.addProposedCombination(proposedCombination);
    }

    public boolean isLooser(){
        return session.isLooser();
    }

    public boolean isWinner(){
        return session.isWinner();
    }

    public int getAttempts(){
        return session.getAttempts();
    }

    public ProposedCombination getProposedCombinationAt(int position){
        return session.getProposedCombinationAt(position);
    }

    public Result getResultAt(int position){
        return session.getResultAt(position);
    }

    public void next() {
        this.session.next();
    }
}
