import java.util.Scanner;

public class perfectsqr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPerfectSquare(number)) {
            System.out.println(number + " is a perfect square and its square root is " + Math.sqrt(number));
        } else {
            System.out.println(number + " is not a perfect square");
        }
    }

    public static boolean isPerfectSquare(int num) {
        double sqrt = Math.sqrt(num);
        return (sqrt - Math.floor(sqrt)) == 0;
    }
}
