package Model;

public class Room {
    private Door[] myDoors;
    private int myX;
    private int myY;

    /**
     * Constructor initializes the fields.
     */
    public Room(final int theX, final int theY,
                final int theDoor[][]){
        myX = theX;
        myY = theY;
        //myDoors = theDoor

    }

    /**
     * Get the current status of X.
     */
    public int getMyX(){
        return myX;
    }

    /**
     * Get the current status of Y.
     */
    public int getMyY(){
        return myY;
    }

    /**
     * Getter to return the status of the door.
     */
    public Door[] getMyDoors(){
        return myDoors;
    }

    /**
     * Moves position down by one.
     */
    public void moveDown(final int theRowNum) {
        if (myY + 1 >= 0) myY--;
    }

    /**
     * Moves position up by one.
     */
    public void moveUp(final int theRowNum) {
        if (myY + 1 < theRowNum) myY++;
    }

    /**
     * Moves position by one to the right.
     */
    public void moveRight(final int theRowNum) {
        if (myX + 1 < theRowNum) myX++;
    }

    /**
     * Moves position by one to the left.
     */
    public void moveLeft(final int theRowNum) {
        if (myY + 1 >= 0) myX--;
    }
}
