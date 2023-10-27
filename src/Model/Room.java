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

}
