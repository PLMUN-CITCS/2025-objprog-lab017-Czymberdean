import java.util.Scanner;

public class StudentGrading {
    public static void main(String[] args) {
        // Get student score
        double score = getStudentScore();

        // Calculate grade
        String grade = calculateGrade(score);

        // Display result
        System.out.println("Your Grade is: " + grade);
    }

    // Method to get the student's score
    public static double getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        double score = -1; // Initialize with an invalid value

        // Input validation loop
        while (true) {
            System.out.print("Enter your score: ");
            if (scanner.hasNextDouble()) { 
                score = scanner.nextDouble();
                if (score >= 0 && score <= 100) { // Valid score range
                    break;
                } else {
                    System.out.println("Please enter a valid score between 0 and 100.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // Consume invalid input
            }
        }

        scanner.close(); // Close the scanner
        return score;
    }

    // Method to calculate the letter grade
    public static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
