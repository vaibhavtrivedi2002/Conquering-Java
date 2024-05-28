import java.util.Scanner;

public class circlecmf{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate circumference using the formula 2 * pi * radius
        double circumference = 2 * Math.PI * radius;

        System.out.println("The circumference of the circle is: " + circumference);
    }
}
