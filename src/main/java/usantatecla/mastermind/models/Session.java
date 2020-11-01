package usantatecla.mastermind.models;

import usantatecla.mastermind.enums.StateValue;

public class Session {

    private Game game;
    private GameRegistry gameRegistry;
    private State state;

    public Session(){
        this.game = new Game();
        this.gameRegistry = new GameRegistry(this.game);
        this.state =  new State();
    }

    public void clear(){
        this.game.clear();
        this.gameRegistry.clear();
        this.state.initialize();
    }

    public void addProposedCombination(ProposedCombination proposedCombination){
        this.game.addProposedCombination(proposedCombination);
        this.gameRegistry.register();
    }

    public Result getResultAt(int position){
        return this.game.getResultAt(position);
    }

    public ProposedCombination getProposedCombinationAt(int position){
        return this.game.getProposedCombinationAt(position);
    }
    public boolean isLooser(){
        return this.game.isLooser();
    }

    public boolean isWinner(){
        return this.game.isWinner();
    }

    public int getAttempts(){
        return this.game.getAttempts();
    }
    public boolean isUndoable() {
        return this.gameRegistry.isUndoable();
    }

    public boolean isRedoable(){
        return this.gameRegistry.isRedoable();
    }

    public void next(){
        this.state.next();
    }

    public StateValue getValueState(){
        return this.state.getStateValue();
    }

    public void redo(){
        this.gameRegistry.redo();
    }

    public void undo(){
        this.gameRegistry.undo();
    }
}
