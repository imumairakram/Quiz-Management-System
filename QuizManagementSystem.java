import java.util.Scanner;

public class QuizManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get student information
        System.out.print("Enter your name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter your student ID: ");
        String studentID = scanner.nextLine();

        // Create a Student object using encapsulation
        Student student = new Student(studentName, studentID);

        do {
            // Display quiz options and let the user choose
            System.out.println("Select a quiz:");
            System.out.println("1. General Knowledge");
            System.out.println("2. Math");
            System.out.print("Enter your choice (1 or 2): ");
            int quizChoice = scanner.nextInt();

            // Use polymorphism to handle different quiz types
            Quiz quiz;
            if (quizChoice == 1) {
                quiz = new GeneralKnowledgeQuiz();
            } else if (quizChoice == 2) {
                quiz = new MathQuiz();
            } else {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            // Start the selected quiz
            quiz.startQuiz();

            // Display the score
            System.out.println("Name: " + student.getName());
            System.out.println("ID: " + student.getStudentID());
            System.out.println("Score: " + quiz.calculateScore() + " out of 5");

            // Ask if the user wants to attempt another quiz
            System.out.print("Do you want to attempt another quiz? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                System.out.println("Goodbye, " + student.getName() + "!");
                break;
            }
        } while (true);

        scanner.close();
    }
}
