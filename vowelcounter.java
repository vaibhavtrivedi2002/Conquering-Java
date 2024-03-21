import java.util.Scanner;

public class vowelcounter {

  public static int countVowels(String str) {
    int count = 0;
    str = str.toLowerCase(); // Convert to lowercase for case-insensitive counting

    for (char ch : str.toCharArray()) {
      if ("aeiou".contains(String.valueOf(ch))) {
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String input = scanner.nextLine();

    int vowelCount = countVowels(input);
    System.out.println("The number of vowels in the string: " + vowelCount);

    scanner.close(); // Close the Scanner to avoid resource leaks
  }
}
