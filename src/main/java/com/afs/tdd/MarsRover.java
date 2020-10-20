package com.afs.tdd;

import java.util.Arrays;
import java.util.List;

public class MarsRover {
    //enum
    private static final String MOVE = "M";
    private static final String LEFT = "L";
    private static final String RIGHT = "R";
    private static final List<String> VALID_MOVEMENT = Arrays.asList(MOVE, LEFT, RIGHT);

    private RoverStatus roverStatus;

    public MarsRover(int x, int y, String direction) {
        this.roverStatus = new RoverStatus(x, y, direction);
    }

    public int getX() {
        return roverStatus.getX();
    }

    public int getY() {
        return roverStatus.getY();
    }

    public String getDirection() {
        return roverStatus.getDirection();
    }

    public void getRoverPosition(String movement){
        if(isValidMovement(movement)) {
            Arrays.asList(movement.split(""))
                    .forEach(this::getRoverPositionPerCommand);
        } else throw new CommandNotDefinedException();
    }

    private void getRoverPositionPerCommand(String command) {
        roverStatus = new CommandFactory().build(command).execute(roverStatus);
    }

    private boolean isValidMovement(String movement) {
        return VALID_MOVEMENT.containsAll(Arrays.asList(movement.split("")));
    }

}
