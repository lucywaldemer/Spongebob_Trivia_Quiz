
public abstract class Question {
    // variables
private final String theQuestion;
private final String theAnswer;

    // constructors
public Question(String question, String answer){
    this.theQuestion = question;
    this.theAnswer = answer;
}
    //methods
    //getters
    public String getTheQuestion() { return this.theQuestion; }
    public String getTheAnswer() { return this.theAnswer; }
    // another method
    public abstract boolean checkAnswer(String answer);
}
