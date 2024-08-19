import java.util.Scanner;

public class GeneralKnowledgeQuiz implements Quiz {
    private int score;
    private final String[] questions = {
            "What is the capital of Germany?",
            "Who founded Volkswagen?",
            "Which planet is known as the Red Planet?",
            "Who wrote 'To Kill a Mockingbird'?",
            "Which ocean is the largest on Earth?"
    };
    private final String[][] options = {
            {"a. Paris", "b. Berlin", "c. London", "d. Rome"},
            {"a. Henry Ford", "b. Karl Benz", "c. Gottlieb Daimler", "d. Ferdinand Porsche"},
            {"a. Venus", "b. Mars", "c. Jupiter", "d. Saturn"},
            {"a. J.K. Rowling", "b. Harper Lee", "c. George Orwell", "d. Mark Twain"},
            {"a. Pacific Ocean", "b. Indian Ocean", "c. Southern Ocean", "d. Atlantic Ocean"}
    };
    private final char[] answers = {'b', 'd', 'b', 'b', 'a'};

    @Override
    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            // Display question
            System.out.println(questions[i]);

            // Display options
            for (String option : options[i]) {
                System.out.println(option);
            }

            // Get user's answer
            System.out.print("Enter your answer (a/b/c/d): ");
            char userAnswer = scanner.next().toLowerCase().charAt(0);

            // Check if the answer is correct
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
