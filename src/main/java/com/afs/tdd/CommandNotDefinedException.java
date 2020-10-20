package com.afs.tdd;

public class CommandNotDefinedException extends RuntimeException{
    CommandNotDefinedException() {
        super("Command Not Defined");
    }
}
