public class MultipleChoice extends Question {
    //variables

    //constructor
    public MultipleChoice(String question, String answer) {
        super(question, answer);
    }

    // methods
    @Override
    public boolean checkAnswer(String answer) {
        // answer A or B
        String actualAnswer = this.getTheAnswer();

        if (answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}
