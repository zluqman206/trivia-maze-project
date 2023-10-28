package Model;

public interface DoorInterface {

    public boolean isLocked();

    public QuestionAnswer.Question getQuestion();

    public void lock(final boolean theLocked);


}