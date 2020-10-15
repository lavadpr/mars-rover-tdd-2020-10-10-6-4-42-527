package com.afs.tdd;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MarsRover {
    private static final String MOVE = "M";
    private static final String LEFT = "L";
    private static final String RIGHT = "R";
    private static final String NORTH = "N";
    private static final String EAST = "E";
    private static final String SOUTH = "S";
    private static final String WEST = "W";
    private static final List<String> VALID_MOVEMENT = Arrays.asList(MOVE, LEFT, RIGHT);
    private int x;
    private int y;
    private String direction;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getDirection() {
        return direction;
    }

    public void getRoverPosition(String movement) throws CommandNotDefinedException {
//        if(isValidMovement(movement))
            Arrays.asList(movement.split(""))
                .forEach(this::getRoverPositionPerCommand);
//        else throw new CommandNotDefinedException();
    }

    private void getRoverPositionPerCommand(String command) {
        switch (command) {
            case MOVE:
                move();
                break;
            case LEFT:
                turnLeft();
                break;
            case RIGHT:
                turnRight();
                break;
        }
    }

    private boolean isValidMovement(String movement) {
        return VALID_MOVEMENT.containsAll(Arrays.asList(movement.split("")));
    }

    private void turnRight() {
        switch (direction) {
            case SOUTH:
                direction = WEST;
                break;
            case EAST:
                direction = SOUTH;
                break;
            case NORTH:
                direction = EAST;
                break;
            case WEST:
                direction = NORTH;
                break;
        }
    }

    private void turnLeft() {
        switch (direction) {
            case NORTH:
                direction = WEST;
                break;
            case EAST:
                direction = NORTH;
                break;
            case SOUTH:
                direction = EAST;
                break;
            case WEST:
                direction = SOUTH;
                break;
        }
    }

    private void move() {
        switch (direction) {
            case NORTH:
                y++;
                break;
            case SOUTH:
                y--;
                break;
            case EAST:
                x++;
                break;
            case WEST:
                x--;
                break;
        }
    }

    class CommandNotDefinedException extends Exception {
        public CommandNotDefinedException() {
            super("Command Not Defined");
        }
    }
}
