<<<<<<< HEAD
package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class QuestionAnswer {
    private String myQuestionString;
    private String myType;
    private Question myQuestion;
    private String myAnswer;
    private ArrayList<Question> myQuestionList;
    private ArrayList<String> myAnswerList;
    private HashMap<String, String>  myQAPairs;

=======
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
>>>>>>> matiBranch
    public QuestionAnswer() {

        myQuestionList = new ArrayList<>();
        myAnswerList = new ArrayList<>();
        myQAPairs = new HashMap<>();
    }

<<<<<<< HEAD
=======
    /**
     * Adds questions and  its answers to HashMap.
     * @param theQuestion is the question.
     * @param theAnswer is the answer.
     */
>>>>>>> matiBranch

    public void addQAPair(final Question theQuestion, final String theAnswer) {
        myQAPairs.put(theQuestion.getQuestionString(), theAnswer);
    }
<<<<<<< HEAD
=======
    /**
     * Adds questions to its list.
     * @param theQuestion is the question.
     */
>>>>>>> matiBranch

    public void addToQuestionList(final Question theQuestion) {
        myQuestionList.add(theQuestion);
    }
<<<<<<< HEAD
=======
    /**
     * Adds answers to its list.
     * @param theAnswer is the answer.
     */
>>>>>>> matiBranch

    public void addToAnswerList(final String theAnswer) {
        myAnswerList.add(theAnswer);
    }

<<<<<<< HEAD
=======
    /**
     * Checks the answers to the questions.
     * @param theQuestion is the question.
     * @param theAnswer is the answer.
     * @return returns the true if correct otherwise false.
     */
>>>>>>> matiBranch
    public boolean isAnswerCorrect(final Question theQuestion, final String theAnswer) {
        return Objects.equals(myQAPairs.get(theQuestion.getQuestionString()), theAnswer);
    }

<<<<<<< HEAD
=======
    /**
     * Gets the question.
     * @return returns the questions.
     */
>>>>>>> matiBranch
    public Question getMyQuestion() {
        return myQuestion;
    }

<<<<<<< HEAD
    public class Question {


        private String myQuestion;
        private String myType;



=======
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
>>>>>>> matiBranch
        Question(String question, String type) {
            this.myQuestion = question;
            this.myType = type;
        }

<<<<<<< HEAD
=======
        /**
         * Returns the question string.
         * @return returns the question as a string.
         */
>>>>>>> matiBranch
        public String getQuestionString() {
            return myQuestion;
        }

<<<<<<< HEAD
=======
        /**
         * This method returns the question type.
         * @return returns the type of question.
         */

>>>>>>> matiBranch
        public String questionType() {
            return myType;
        }
    }

<<<<<<< HEAD




=======
>>>>>>> matiBranch
}
