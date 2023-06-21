package turtleGraphics;

import static turtleGraphics.Direction.*;
import static turtleGraphics.PenState.*;

public class Turtle {
    private Pen biro = new Pen();
    private Direction currentDirection = Direction.EAST;
    private Position currentPosition = new Position(0, 0);

    public Pen getPen() {
//        return null;
//        return new Pen();
        return biro;
    }

    public void penDown() {
        biro.setState(PenState.DOWN);
    }

    public void penUp() {
        biro.setState(UP);
    }

    public Direction getCurrentDirection() {
//        return null;
//        return Direction.EAST;
        return currentDirection;
    }

    public void turnRight() {

        if (currentDirection == Direction.EAST) face(SOUTH);
        else if (currentDirection == SOUTH) face(WEST);
        else if (currentDirection == WEST) face(NORTH);
        else if (currentDirection == NORTH) face(EAST);
//            currentDirection = Direction.SOUTH;
    }

    private void face(Direction direction) {
        currentDirection = direction;
    }

    public void turnLeft() {
        if (currentDirection == EAST) face(NORTH);
        else if (currentDirection == NORTH) face(WEST);
        else if (currentDirection == WEST) face(SOUTH);
        else if (currentDirection == SOUTH) face(EAST);
    }

    public Position getCurrentPosition() {
//        return null;
//        return new Position(0,4);

        return currentPosition;
    }

    public void moveWithoutWriting(int nosOfSteps) {
        if (currentDirection == EAST) increaseColumnBy(nosOfSteps - 1);
        else if (currentDirection == SOUTH) increaseRowBy(nosOfSteps - 1);
        else if (currentDirection == WEST) decreaseColumnBy(nosOfSteps - 1);
        else if (currentDirection == NORTH) decreaseRowBy(nosOfSteps - 1);


    }
    private void increaseRowBy(int increase) {
//       int currentRow = currentPosition.getRow;
        currentPosition.setRow(currentPosition.getRow() + increase);
    }

    private void increaseColumnBy(int increase) {
        int currentColumn = currentPosition.getColumn();
        currentPosition.setColumn(currentPosition.getColumn() + increase);
    }

    private void decreaseRowBy(int decrease) {
        currentPosition.setRow(currentPosition.getRow() - decrease);
    }

    private void decreaseColumnBy(int decrease) {
        currentPosition.setColumn(currentPosition.getColumn() - decrease);
    }
}

