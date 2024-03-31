//this program calculates percentage from marks
import java.util.Scanner;

public class percentagecalc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks obtained: ");
        int obtainedMarks = scanner.nextInt();

        System.out.print("Enter the total marks: ");
        int totalMarks = scanner.nextInt();

        double percentage = calculatePercentage(obtainedMarks, totalMarks);

        System.out.println("The percentage of marks obtained is: " + percentage + "%");
    }

    public static double calculatePercentage(int obtainedMarks, int totalMarks) {
        if (totalMarks == 0) {
            return 0.0;
        } else {
            return (obtainedMarks * 100.0) / totalMarks;
        }
    }
}
