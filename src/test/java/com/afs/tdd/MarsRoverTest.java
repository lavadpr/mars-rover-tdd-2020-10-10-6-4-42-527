package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MarsRoverTest {
    @Test
    void should_x_0_y_1_direction_N_when_getRoverPosition_given_x_0_y_0_direction_N_movement_M() throws CommandNotDefinedException {
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
    void should_x_0_y_0_direction_W_when_getRoverPosition_given_x_0_y_0_direction_N_movement_L() throws CommandNotDefinedException {
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
    @Test
    void should_x_0_y_n1_direction_S_when_getRoverPosition_given_x_0_y_0_direction_S_movement_M() {
        //given
        String movement = "M";
        MarsRover marsRover = new MarsRover(0,0,"S");
        //when
        marsRover.getRoverPosition(movement);
        //then
        assertEquals(0, marsRover.getX());
        assertEquals(-1, marsRover.getY());
        assertEquals("S", marsRover.getDirection());
    }
    @Test
    void should_x_0_y_0_direction_E_when_getRoverPosition_given_x_0_y_0_direction_S_movement_L() {
        //given
        String movement = "L";
        MarsRover marsRover = new MarsRover(0,0,"S");
        //when
        marsRover.getRoverPosition(movement);
        //then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("E", marsRover.getDirection());
    }
    @Test
    void should_x_0_y_0_direction_W_when_getRoverPosition_given_x_0_y_0_direction_S_movement_R() {
        //given
        String movement = "R";
        MarsRover marsRover = new MarsRover(0,0,"S");
        //when
        marsRover.getRoverPosition(movement);
        //then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("W", marsRover.getDirection());
    }
    @Test
    void should_x_1_y_0_direction_E_when_getRoverPosition_given_x_0_y_0_direction_E_movement_M() {
        //given
        String movement = "M";
        MarsRover marsRover = new MarsRover(0,0,"E");
        //when
        marsRover.getRoverPosition(movement);
        //then
        assertEquals(1, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("E", marsRover.getDirection());
    }
    @Test
    void should_x_0_y_0_direction_N_when_getRoverPosition_given_x_0_y_0_direction_E_movement_L() {
        //given
        String movement = "L";
        MarsRover marsRover = new MarsRover(0,0,"E");
        //when
        marsRover.getRoverPosition(movement);
        //then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("N", marsRover.getDirection());
    }
    @Test
    void should_x_0_y_0_direction_S_when_getRoverPosition_given_x_0_y_0_direction_E_movement_R() {
        //given
        String movement = "R";
        MarsRover marsRover = new MarsRover(0,0,"E");
        //when
        marsRover.getRoverPosition(movement);
        //then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("S", marsRover.getDirection());
    }
    @Test
    void should_x_n1_y_0_direction_W_when_getRoverPosition_given_x_0_y_0_direction_W_movement_M() {
        //given
        String movement = "M";
        MarsRover marsRover = new MarsRover(0,0,"W");
        //when
        marsRover.getRoverPosition(movement);
        //then
        assertEquals(-1, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("W", marsRover.getDirection());
    }
    @Test
    void should_x_0_y_0_direction_S_when_getRoverPosition_given_x_0_y_0_direction_W_movement_L() {
        //given
        String movement = "L";
        MarsRover marsRover = new MarsRover(0,0,"W");
        //when
        marsRover.getRoverPosition(movement);
        //then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("S", marsRover.getDirection());
    }
    @Test
    void should_x_0_y_0_direction_N_when_getRoverPosition_given_x_0_y_0_direction_W_movement_R() {
        //given
        String movement = "R";
        MarsRover marsRover = new MarsRover(0,0,"W");
        //when
        marsRover.getRoverPosition(movement);
        //then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("N", marsRover.getDirection());
    }
    @Test
    void should_CommandNotDefinedException_when_getRoverPosition_given_movement_F() {
        //given
        String movement = "F";
        MarsRover marsRover = new MarsRover(0,0,"N");
        //when
        //then
        assertThrows(CommandNotDefinedException.class, () -> {
            marsRover.getRoverPosition(movement);
        });
    }
    @Test
    void should_x_n1_y_1_direction_N_when_getRoverPosition_given_x_0_y_0_direction_N_movement_MLMR(){
        //given
        String movement = "MLMR";
        MarsRover marsRover = new MarsRover(0,0,"N");
        //when
        marsRover.getRoverPosition(movement);
        //then
        assertEquals(-1, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals("N", marsRover.getDirection());
    }
}
