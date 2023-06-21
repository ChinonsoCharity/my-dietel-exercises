package turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtleGraphics.Direction.*;
import static turtleGraphics.PenState.*;

class turtleTest {
    Turtle ijapa;
    Pen thePen;

    @BeforeEach
    public void setUp() {
        ijapa = new Turtle();
        thePen = ijapa.getPen();
    }

    @Test
    public void turtleExist() {
        assertNotNull(ijapa);
    }

    @Test
    public void turtleHasAPenTest() {
        Pen thePen = ijapa.getPen();
        assertNotNull(thePen);
    }

    @Test
    public void penIsUpByDefault() {
        assertEquals(thePen.getState(), PenState.UP);
    }

    @Test
    public void turtleCanMovePenDownTest() {
        assertEquals(thePen.getState(), PenState.UP);
        ijapa.penDown();
        assertSame(thePen.getState(), DOWN);
    }

    @Test
    public void penCanMoveUpTest() {
        //given
        ijapa.penDown();
        assertSame(thePen.getState(), DOWN);
//        when
        ijapa.penUp();
        assertSame(thePen.getState(), UP);
    }

    @Test
    public void turtleCanTurnRight_whileFacingEast() {
        assertSame(ijapa.getCurrentDirection(), Direction.EAST);
        ijapa.turnRight();
//        assert
        assertSame(ijapa.getCurrentDirection(), Direction.SOUTH);
    }

    @Test
    public void turtleCanTurnRight_whileFacingSouth() {
        ijapa.turnRight();
        assertSame(ijapa.getCurrentDirection(), Direction.SOUTH);
        ijapa.turnRight();
//        assert
        assertSame(WEST, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRight_whileFacingNorth() {
        ijapa.turnRight();
        assertSame(ijapa.getCurrentDirection(), SOUTH);
        ijapa.turnRight();
        assertSame(ijapa.getCurrentDirection(), WEST);
        ijapa.turnRight();
        assertSame(ijapa.getCurrentDirection(), NORTH);
        ijapa.turnRight();
//        assert
        assertSame(ijapa.getCurrentDirection(), EAST);

    }

    @Test
    public void turtleCanTurnLeft_whileFacingEast() {
        ijapa.turnLeft();
        assertSame(ijapa.getCurrentDirection(), NORTH);
    }

    @Test
    public void turtleCanTurnLeft_whileFacingNorth() {
        ijapa.turnLeft();
        assertSame(ijapa.getCurrentDirection(), NORTH);
        ijapa.turnLeft();
        //assert
        assertSame(ijapa.getCurrentDirection(),WEST);
    }
    @Test
    public void turtleCanTurnLeft_whileFacingWest(){
        ijapa.turnLeft();
        assertSame(ijapa.getCurrentDirection(), NORTH);
        ijapa.turnLeft();
        assertSame(ijapa.getCurrentDirection(), WEST);
        ijapa.turnLeft();
        //assert
        assertSame(ijapa.getCurrentDirection(),SOUTH);
    }
    @Test
    public void turtleCanTurnLeft_whileFacingSouth(){
        ijapa.turnLeft();
        assertSame(ijapa.getCurrentDirection(), NORTH);
        ijapa.turnLeft();
        assertSame(ijapa.getCurrentDirection(), WEST);
        ijapa.turnLeft();
        assertSame(ijapa.getCurrentDirection(),SOUTH);
        ijapa.turnLeft();
        //assert
        assertSame(ijapa.getCurrentDirection(),EAST);
    }
    @Test
    public void turtleCanMove_whileFacingEast(){
        ijapa.moveWithoutWriting(5);
        ijapa.moveWithoutWriting(6);
        Position expected = new Position(0,9);
        assertEquals(expected,ijapa.getCurrentPosition());

    }
    @Test
    public void turtleCanMove_whileFacingSouth() {
        ijapa.turnRight();
        assertSame(ijapa.getCurrentDirection(),SOUTH);
        ijapa.moveWithoutWriting(5);
        Position expected = new Position(4, 0);
        assertEquals(expected, ijapa.getCurrentPosition());

    }
    @Test
    public void turtleCanMove_whileFacingWest() {
        ijapa.moveWithoutWriting(7);
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(ijapa.getCurrentDirection(),WEST);
        ijapa.moveWithoutWriting(4);
        Position expected = new Position(0, 3);
        assertEquals(expected, ijapa.getCurrentPosition());

    }
    @Test
    public void turtleCanMove_whileFacingNorth() {
        ijapa.moveWithoutWriting(9);
        ijapa.turnRight();
        ijapa.moveWithoutWriting(9);
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(ijapa.getCurrentDirection(),NORTH);
        ijapa.moveWithoutWriting(7);
        Position expected = new Position(2, 8);
        assertEquals(expected, ijapa.getCurrentPosition());
    }


    }