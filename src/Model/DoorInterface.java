/*
    Name: Matiullah Jalal, Zakiraye Luqman, Hawo Issa
    Date: 11/06/2023
    Quarter: Autumn 2023
 */
package Model;

/**
 * The door interface allows to check the status of the door.
 * If it is locked or not. And it sets the door status with other object.
 * This class should be implemented by Door class.
 */
public interface DoorInterface {
    /**
     * Get the status of the door.
     * @return returns true if open other false closed.
     */
    public boolean isLocked();

    /**
     * Sets the status of the door to true or false.
     * @param theLocked is a boolean that indicates the lock status of the door.
     */
    public void lock(final boolean theLocked);
}