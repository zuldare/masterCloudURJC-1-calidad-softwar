package usantatecla.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class GameMemento {

    private List<ProposedCombination> proposedCombinations;
    private List<Result> results;
    private final int attempts;

    GameMemento(List<ProposedCombination> proposedCombinations, List<Result> results, int attemps){
        this.proposedCombinations = new ArrayList<>(proposedCombinations);
        this.results = new ArrayList<>(results);
        this.attempts = attemps;
    }

    List<ProposedCombination> getProposedCombinations(){
        return this.proposedCombinations;
    }

    List<Result> getResults(){
        return results;
    }

    int getAttempts(){
        return this.attempts;
    }
}
