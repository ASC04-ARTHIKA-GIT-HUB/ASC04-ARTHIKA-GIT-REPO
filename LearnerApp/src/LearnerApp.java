public class LearnerApp {
    public static void main(String[] args) {
        LearnerArrayData learnerData = new LearnerArrayData();
        learnerData.assignLearnerNames();
        learnerData.printLearnerNames();
        LearnerAnswersMap learnerAnswers = new LearnerAnswersMap();
        learnerAnswers.assignLearnerAnswers();
        learnerAnswers.displayLearnerAnswers();
    }
}

