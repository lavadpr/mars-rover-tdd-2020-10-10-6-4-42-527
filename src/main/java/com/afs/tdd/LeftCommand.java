package com.afs.tdd;

import java.util.Collections;

public class LeftCommand implements Command {
    @Override
    public RoverStatus execute(RoverStatus roverstatus){
        String direction = roverstatus.getDirection();
        int x = roverstatus.getX();
        int y = roverstatus.getY();
        switch (direction) {
            case DirectionConstants.NORTH:
                direction = DirectionConstants.WEST;
                break;
            case DirectionConstants.EAST:
                direction = DirectionConstants.NORTH;
                break;
            case DirectionConstants.SOUTH:
                direction = DirectionConstants.EAST;
                break;
            case DirectionConstants.WEST:
                direction = DirectionConstants.SOUTH;
                break;
        }
        return new RoverStatus(x, y, direction);
    }
}
