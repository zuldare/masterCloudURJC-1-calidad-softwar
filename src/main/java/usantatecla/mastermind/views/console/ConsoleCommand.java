package usantatecla.mastermind.views.console;


import usantatecla.utils.Command;

public abstract class ConsoleCommand implements Command {
    protected String name;

    public ConsoleCommand(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return this.name;
    }

}
