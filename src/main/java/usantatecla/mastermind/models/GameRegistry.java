package usantatecla.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class GameRegistry {

    private Game game;
    private int firstPrevious;
    private List<GameMemento> gameMementos;

    GameRegistry(Game game){
        this.game = game;
        this.clear();
    }

    public void clear(){
        this.firstPrevious = 0;
        this.gameMementos = new ArrayList<>();
    }

    void undo(){
        this.firstPrevious++;
        this.game.setGameMemento(this.gameMementos.get(this.firstPrevious));
    }

    void redo(){
        this.firstPrevious--;
        this.game.setGameMemento(this.gameMementos.get(firstPrevious));
    }

    boolean isUndoable(){
        return this.firstPrevious < this.gameMementos.size() -1;
    }

    boolean isRedoable(){
        return this.firstPrevious >= 1;
    }

    void register() {
        for (int i = 0; i < this.firstPrevious; i++) {
            this.gameMementos.remove(0);
        }

        this.firstPrevious = 0;
        this.gameMementos.add(this.firstPrevious, this.game.createGameMemento());
    }
}
