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
     * Adds questions and  its answers to HashMap.
     * @param theQuestion is the question.
     * @param theAnswer is the answer.
     */

    public void addQAPair(final Question theQuestion, final String theAnswer) {
        myQAPairs.put(theQuestion.getQuestionString(), theAnswer);
    }
    /**
     * Adds questions to its list.
     * @param theQuestion is the question.
     */

    public void addToQuestionList(final Question theQuestion) {
        myQuestionList.add(theQuestion);
    }
    /**
     * Adds answers to its list.
     * @param theAnswer is the answer.
     */

    public void addToAnswerList(final String theAnswer) {
        myAnswerList.add(theAnswer);
    }

    /**
     * Checks the answers to the questions.
     * @param theQuestion is the question.
     * @param theAnswer is the answer.
     * @return returns the true if correct otherwise false.
     */
    public boolean isAnswerCorrect(final Question theQuestion, final String theAnswer) {
        return Objects.equals(myQAPairs.get(theQuestion.getQuestionString()), theAnswer);
    }

    /**
     * Gets the question.
     * @return returns the questions.
     */
    public Question getMyQuestion() {
        return myQuestion;
    }

    /**
     * Inner class that creates questions.
     */

    public class Question {

        /**
         * Holds questions.
         */
        private String myQuestion;
        /**
         * Holds types of questions.
         */
        private String myType;

        /**
         * Initializes the fields.
         * @param question is the question.
         * @param type is the type of question.
         */
        Question(String question, String type) {
            this.myQuestion = question;
            this.myType = type;
        }

        /**
         * Returns the question string.
         * @return returns the question as a string.
         */
        public String getQuestionString() {
            return myQuestion;
        }

        /**
         * This method returns the question type.
         * @return returns the type of question.
         */

        public String questionType() {
            return myType;
        }
    }

}
