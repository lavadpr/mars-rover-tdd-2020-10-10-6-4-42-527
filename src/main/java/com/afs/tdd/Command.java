package com.afs.tdd;

public interface Command {
    RoverStatus execute(RoverStatus roverStatus);
}
