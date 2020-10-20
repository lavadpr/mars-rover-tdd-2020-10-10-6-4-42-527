package com.afs.tdd;

class RoverStatus {
    private int x;
    private int y;
    private String direction;

    RoverStatus(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    String getDirection() {
        return direction;
    }
}
