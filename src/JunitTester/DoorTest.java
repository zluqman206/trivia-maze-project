/*
    Names: Matiullah Jalal, Hawo Issa, Zakiraye Luqman
    Date: 10/29/2023
    Course: TCSS 360
    Quarter: Winter 2023
 */

package JunitTester;

import Model.Door;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Tests each method of the Door class.
 */
class DoorTest {
    /** A field of Door class.*/
    private Door myDoor;
    /** A boolean field to test against the other boolean value .*/
    private boolean myExpectedBoolean;

    /**
     * Initializes the fields.
     */
    @BeforeEach
    void setUp() {
        myDoor = new Door();
        myExpectedBoolean = true;
    }

    /**
     * Tests getter method of the Door class.
     */
    @Test
    void testIsLocked() {
      assertNotEquals(myExpectedBoolean, myDoor.isLocked());
    }

    /**
     * Tests the setter method of the Door class.
     */
    @Test
    void testLock() {
        myDoor.lock(true);
        assertEquals(myExpectedBoolean, myDoor.isLocked());
    }
}
