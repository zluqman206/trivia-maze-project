/*
    Name: Matiullah Jalal, Zakiraye Luqman, Hawo Issa
    Date: 10/25/2023
    Quarter: Autumn 2023
 */

package Model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
public class QuestionAnswer {
    /**
     * Holds the question string.
     */
    private String myQuestionString;
    /**
     * Holds the type of question to choose from.
     */
    private String myType;
    /**
     * Holds the current question.
     */
    private Question myQuestion;
    /**
     * Holds the current answer associated with the current question.
     */
    private String myAnswer;
    /**
     * A list of variability questions.
     */
    private ArrayList<Question> myQuestionList;
    /**
     * A list of variability answers.
     */
    private ArrayList<String> myAnswerList;
    /**
     * Mapping question and answers.
     */
    private HashMap<String, String>  myQAPairs;

    /**
     * Constructor initializes the fields.
     */
    public QuestionAnswer() {

        myQuestionList = new ArrayList<>();
        myAnswerList = new ArrayList<>();
        myQAPairs = new HashMap<>();
    }

    /**
     * adds
     * @param theQuestion
     * @param theAnswer
     */

    public void addQAPair(final Question theQuestion, final String theAnswer) {
        myQAPairs.put(theQuestion.getQuestionString(), theAnswer);
    }

    public void addToQuestionList(final Question theQuestion) {
        myQuestionList.add(theQuestion);
    }

    public void addToAnswerList(final String theAnswer) {
        myAnswerList.add(theAnswer);
    }

    public boolean isAnswerCorrect(final Question theQuestion, final String theAnswer) {
        return Objects.equals(myQAPairs.get(theQuestion.getQuestionString()), theAnswer);
    }

    public Question getMyQuestion() {
        return myQuestion;
    }

    public class Question {


        private String myQuestion;
        private String myType;

        Question(String question, String type) {
            this.myQuestion = question;
            this.myType = type;
        }

        public String getQuestionString() {
            return myQuestion;
        }

        public String questionType() {
            return myType;
        }
    }

}
