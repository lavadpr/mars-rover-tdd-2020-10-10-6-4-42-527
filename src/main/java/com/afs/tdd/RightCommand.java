package com.afs.tdd;

public class RightCommand implements Command{
    @Override
    public RoverStatus execute(RoverStatus roverstatus){
        String direction = roverstatus.getDirection();
        int x = roverstatus.getX();
        int y = roverstatus.getY();
        switch (direction) {
            case DirectionConstants.SOUTH:
                direction = DirectionConstants.WEST;
                break;
            case DirectionConstants.EAST:
                direction = DirectionConstants.SOUTH;
                break;
            case DirectionConstants.NORTH:
                direction = DirectionConstants.EAST;
                break;
            case DirectionConstants.WEST:
                direction = DirectionConstants.NORTH;
                break;
        }
        return new RoverStatus(x, y, direction);
    }
}
