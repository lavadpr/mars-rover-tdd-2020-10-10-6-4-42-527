package com.afs.tdd;

class CommandFactory {
    Command build(String command) {
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
