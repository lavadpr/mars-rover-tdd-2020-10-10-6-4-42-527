package com.afs.tdd;

public class MarsRover {
    public static final String MOVE = "M";
    public static final String LEFT = "L";
    public static final String RIGHT = "R";
    public static final String NORTH = "N";
    public static final String EAST = "E";
    public static final String SOUTH = "S";
    public static final String WEST = "W";
    int x;
    int y;
    String direction;

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

    public void getRoverPosition(String movement) {
        if(movement.equals(MOVE))
            move();
        if(movement.equals(LEFT))
            turnLeft();
        if(movement.equals(RIGHT))
            turnRight();
    }

    private void turnRight() {
        if(direction.equals(NORTH))
            direction = EAST;
        if(direction.equals(SOUTH))
            direction = WEST;
    }

    private void turnLeft() {
        if(direction.equals(NORTH))
            direction = WEST;
        if(direction.equals(SOUTH))
            direction = EAST;
    }

    private void move() {
        if(direction.equals(NORTH))
            y++;
        if(direction.equals(SOUTH))
            y--;
        if(direction.equals(EAST))
            x++;
    }
}
