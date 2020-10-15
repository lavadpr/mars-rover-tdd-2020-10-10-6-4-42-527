package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void should_x_0_y_1_direction_N_when_getRoverPosition_given_x_0_y_0_direction_N_movement_M() {
        //given
        String movement = "M";
        MarsRover marsRover = new MarsRover(0,0,"N");
        //when
        marsRover.getRoverPosition(movement);
        //then
        assertEquals(0, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals("N", marsRover.getDirection());
    }
    @Test
    void should_x_0_y_0_direction_W_when_getRoverPosition_given_x_0_y_0_direction_N_movement_L() {
        //given
        String movement = "L";
        MarsRover marsRover = new MarsRover(0,0,"N");
        //when
        marsRover.getRoverPosition(movement);
        //then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("W", marsRover.getDirection());
    }
    @Test
    void should_x_0_y_0_direction_E_when_getRoverPosition_given_x_0_y_0_direction_N_movement_R() {
        //given
        String movement = "R";
        MarsRover marsRover = new MarsRover(0,0,"N");
        //when
        marsRover.getRoverPosition(movement);
        //then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("E", marsRover.getDirection());
    }
}
