package com.afs.tdd;

public class MoveCommand implements Command{
    @Override
    public RoverStatus execute(RoverStatus roverstatus){
        String direction = roverstatus.getDirection();
        int x = roverstatus.getX();
        int y = roverstatus.getY();
        switch (direction) {
            case DirectionConstants.NORTH:
                y++;
                break;
            case DirectionConstants.SOUTH:
                y--;
                break;
            case DirectionConstants.EAST:
                x++;
                break;
            case DirectionConstants.WEST:
                x--;
                break;
        }
        return new RoverStatus(x, y, direction);
    }
}
