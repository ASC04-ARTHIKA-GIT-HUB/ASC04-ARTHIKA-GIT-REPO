import java.util.HashMap;
public class LearnerAnswersMap {
    HashMap<String,String> learnerAnswers = new HashMap<String,String>();
    public void assignLearnerAnswers() {
        learnerAnswers.put("Maheen", "Private variables cannot be accessed outside the class");
        learnerAnswers.put("Gagan", "The main method should always be main, otherwise we will not be able to run the program");
        learnerAnswers.put("Khyati", "The HashMap belongs to the java.util package");
    }

    public void displayLearnerAnswers() {
        System.out.println("Maheen's answer: " + learnerAnswers.get("Maheen"));
        System.out.println("Gagan's answer: " + learnerAnswers.get("Gagan"));
        System.out.println("Khyati's answer: " + learnerAnswers.get("Khyati"));
    }
}

