/*
    Name: Matiullah Jalal, Zakiraye Luqman, Hawo Issa
    Date: 10/05/2023
    Quarter: Autumn 2023
 */
package Model;

<<<<<<< HEAD
import java.io.Serial;
import java.io.Serializable;

public class Room implements Serializable {
    @Serial
=======
//import java.io.Serial;
import java.io.Serializable;

public class Room implements RoomInterface, Serializable {
    //@Serial
>>>>>>> matiBranch
    private static final long serialVersionUID = -89283998989899829L;
    private Door myDoor;
    private int myX;
    private int myY;
    private char myRoomLetter;

    private QuestionAnswer myQA;

    /**
     * Constructor initializes the fields.
     */
    public Room(final char letter, final int theX, final int theY,
                final Door theDoor) {
        myRoomLetter = letter;
        myX = theX;
        myY = theY;
        myDoor = theDoor;
<<<<<<< HEAD

=======
>>>>>>> matiBranch
    }

    /**
     * Get the current status of X.
     */
<<<<<<< HEAD
=======
    @Override
>>>>>>> matiBranch
    public int getMyX() {
        return myX;
    }

    /**
     * Get the current status of Y.
     */
<<<<<<< HEAD
=======
    @Override
>>>>>>> matiBranch
    public int getMyY() {
        return myY;
    }

    /**
     * Getter to return the status of the door.
     */
<<<<<<< HEAD
    public Door getMyDoor() {
        return myDoor;
    }



    public char getLetter() {
        return myRoomLetter;
    }

    public QuestionAnswer.Question getQuestion() {
        return myQA.getMyQuestion();
    }
}


=======
    @Override
    public Door getMyDoor() {
        return myDoor;
    }
    @Override
    public char getLetter() {
        return myRoomLetter;
    }
    @Override
    public QuestionAnswer.Question getQuestion() {
        return myQA.getMyQuestion();
    }
}
>>>>>>> matiBranch
