//this program counts the number of consonants in the string given by user
import java.util.Scanner;

public class consonantcounter {

  public static int countConsonants(String str) {
    int count = 0;
    str = str.toLowerCase(); // Convert to lowercase for case-insensitive counting

    for (char ch : str.toCharArray()) {
      if (Character.isLetter(ch) && !"aeiou".contains(String.valueOf(ch))) {
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String input = scanner.nextLine();

    int consonantCount = countConsonants(input);
    System.out.println("The number of consonants in the string: " + consonantCount);

    scanner.close(); // Close the Scanner to avoid resource leaks
  }
}
