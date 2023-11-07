/*
    Name: Matiullah Jalal, Zakiraye Luqman, Hawo Issa
    Date: 11/06/2023
    Quarter: Autumn 2023
 */
package Model;
/**
 * The Door class implements DoorInterface and provides methods to check the status of the door.
 * If it is locked or not. And it sets the lock status to ture of false.
 */
public class Door implements DoorInterface {
    private boolean myIsLocked;

    /**
     * Constructor initializes the fields.
     */
    public Door(){
        // initially the door is open
        myIsLocked = false;
    }
    /**
     * A getter method to get current status of the door.
     */
    @Override
    public boolean isLocked(){
        return myIsLocked;
    }
    /**
     * A setter to set either door is locked or not.
     */
    @Override
    public void lock(final boolean theLocked){
        myIsLocked = theLocked;
    }
}