import java.util.Scanner;

public class MathQuiz implements Quiz {
    private int score;
    private final String[] questions = {"2 + 2 = 5", "5 * 3 = 14", "10 / 2 = 5", "4 - 1 = 3", "6 / 3 = 3"};
    private final boolean[] answers = {false, false, true, true, false};

    @Override
    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Enter your answer (true/false): ");
            boolean userAnswer = scanner.nextBoolean();

            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
        }
    }

    @Override
    public int calculateScore() {
        return score;
    }
}
