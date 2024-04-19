import java.util.Scanner;

public class prevnextnum {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    int previousNumber = number - 1;
    int nextNumber = number + 1;

    System.out.println("Previous number: " + previousNumber);
    System.out.println("Current number: " + number);
    System.out.println("Next number: " + nextNumber);
  }
}
