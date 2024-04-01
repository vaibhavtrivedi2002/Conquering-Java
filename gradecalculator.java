//this program calculates grades by taking user input
import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the marks obtained (out of 100): ");
        int marks = scanner.nextInt();

        String grade = calculateGrade(marks);

        System.out.println("Grade: " + grade);

        scanner.close();
    }

    public static String calculateGrade(int marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
