public class CheckBox extends Question {

    //variables

    //constructors
    public CheckBox(String question, String answer) {
        super(question, answer);
    }

    //method
    @Override
    public boolean checkAnswer(String answer) {
        // answer = A,B,C
        String actualAnswer = this.getTheAnswer();
        if (answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}
