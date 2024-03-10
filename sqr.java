import java.util.Scanner;

public class sqr {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    int square = number * number;

    System.out.println("The square of " + number + " is: " + square);

    scanner.close(); 
  }
}

//public class SquareNumber {
//public static void main(String[] args) {
//int number = 5;
//double square = Math.pow(number, 2);  // Note: Math.pow returns a double
//System.out.println("The square of " + number + " is: " + square);
//}
//}
  
