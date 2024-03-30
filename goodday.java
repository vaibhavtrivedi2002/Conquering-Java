//this program takes input from user and greet them
import java.util.Scanner;
public class goodday{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "! Have a good day!");
    }
}
