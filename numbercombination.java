import java.util.Scanner;

public class numbercombinations {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter three numbers: ");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    int num3 = scanner.nextInt();

    System.out.println("All possible combinations:");
    printCombinations(num1, num2, num3);
  }

  public static void printCombinations(int num1, int num2, int num3) {
    System.out.println(num1 + " " + num2 + " " + num3);
    System.out.println(num1 + " " + num3 + " " + num2);
    System.out.println(num2 + " " + num1 + " " + num3);
    System.out.println(num2 + " " + num3 + " " + num1);
    System.out.println(num3 + " " + num1 + " " + num2);
    System.out.println(num3 + " " + num2 + " " + num1);
  }
}
