public class TrueFalse extends Question{
    //variables

    //constructors
    public TrueFalse(String question, String answer) {
        super(question, answer);
    }

    //method
    @Override
    public boolean checkAnswer(String answer) {
        // answer = true
        // answer = false
        if (answer.toUpperCase().equals(this.getTheAnswer().toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}
