import java.util.Scanner;

public class squaresum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        int squaredSum = a * a + 2 * a * b + b * b;

        System.out.println("The square of (a + b) is: " + squaredSum);
    }
}
