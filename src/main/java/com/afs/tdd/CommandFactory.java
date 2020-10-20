package com.afs.tdd;

public class CommandFactory {
    public Command build(String command) {
        if(command.equalsIgnoreCase("M")){
            return new MoveCommand();
        }
        if(command.equalsIgnoreCase("L")){
            return new LeftCommand();
        }
        if(command.equalsIgnoreCase("R")){
            return new RightCommand();
        }
        throw new CommandNotDefinedException();
    }
}
