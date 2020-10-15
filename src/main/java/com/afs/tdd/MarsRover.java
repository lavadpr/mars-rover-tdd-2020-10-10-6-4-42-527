package com.afs.tdd;

public class MarsRover {
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
        if(movement.equals("M"))
            move();
    }

    private void move() {
        if(direction.equals("N"))
            y++;
    }
}
