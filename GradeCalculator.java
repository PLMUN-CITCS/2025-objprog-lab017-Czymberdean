import java.util.Scanner;

public class GradeCalculator {
    
    // Method to get student score from user
    public static double getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        double score = -1;
        
        while (score < 0 || score > 100) {
            try {
                System.out.print("Enter your score: ");
                score = Double.parseDouble(scanner.nextLine());
                
                if (score < 0 || score > 100) {
                    System.out.println("Invalid score. Please enter a value between 0 and 100.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numerical value.");
            }
        }
        
        return score;
    }
    
    // Method to determine the letter grade
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
    
    public static void main(String[] args) {
        // Get student score
        double score = getStudentScore();
        
        // Calculate and display grade
        String grade = calculateGrade(score);
        System.out.println("Your Grade is: " + grade);
    }
}
