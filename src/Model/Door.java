package Model;

public class Door implements DoorInterface {
    private boolean myIsLocked;
    private QuestionAnswer myQA;

    /**
     * Constructor initializes the fields.
     */
    public Door(){
        // initially the door is open
        myIsLocked = false;
        myQA = null;
    }

    /**
     * A getter method to get current status of the door.
     */
    public boolean isLocked(){
        return myIsLocked;
    }

    public QuestionAnswer.Question getQuestion() {
        return myQA.getMyQuestion();
    }

    /**
     * A setter to set either door is locked or not.
     */
    public void lock(final boolean theLocked){
        myIsLocked = theLocked;
    }
    /**
     * A to string to print on console.
     */
//    public String toString(){
//
//    }
}
