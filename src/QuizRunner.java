
public class QuizRunner {
    public static void main(String[] args){
        Quiz myQuiz = new Quiz();
MultipleChoice questionOne = new MultipleChoice("Where does SpongeBob work?\n A. Chum Bucket \n B. Krusty Krab \n Please select your answer by typing A or B ", "B");
myQuiz.addQuestion(questionOne);

CheckBox questionTwo = new CheckBox("Which characters speak English? Type the letters for all correct answers using CAPITAL LETTERS and commas in between: \n A. Patrick \n B. Gary \n C. Pearl", "A, C");
myQuiz.addQuestion(questionTwo);

TrueFalse questionThree = new TrueFalse("Mrs. Puff thinks Spongebob is an amazing driver. \nType True or False",  "False");
myQuiz.addQuestion(questionThree);

myQuiz.runQuiz();


    }
}
