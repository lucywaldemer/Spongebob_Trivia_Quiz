import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    //variables
    private ArrayList<Question> questions = new ArrayList<Question>();
    private int numberOfQuestionsCorrect = 0;
    private Scanner scanner = new Scanner(System.in);


    //constructor
    public Quiz() {

    }

    //method
    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void runQuiz() {
        //loop through questions
        for (Question question : questions) {
            // ask questions
            System.out.println(question.getTheQuestion());
            // get answer
            String usersAnswer = this.getUsersAnswers();
            //check answer
            boolean userGotQuestionCorrect = question.checkAnswer(usersAnswer);
            // Increment numberOfQuestionsCorrect if true
            if (userGotQuestionCorrect) {
                this.numberOfQuestionsCorrect++;
            }
        }

        // Grade the quiz
        double percentageCorrect = ((double) this.numberOfQuestionsCorrect / (double) this.questions.size()) * 100;
        System.out.println("Your grade: " + percentageCorrect + "% !!!");
    }

    private String getUsersAnswers() {
        String usersAnswer = scanner.nextLine();
        return usersAnswer;
    }
}
