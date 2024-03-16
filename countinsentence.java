//this program counts total words in a sentence
import java.util.Scanner;
import java.util.StringTokenizer;

public class countinsentence {
     public static int countWords(String str) {
    if (str == null || str.isEmpty()) {
      return 0;
    }
    StringTokenizer tokenizer = new StringTokenizer(str);
    return tokenizer.countTokens();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a sentence: ");
    String sentence = scanner.nextLine();

    int wordCount = countWords(sentence);
    System.out.println("Number of words: " + wordCount);

    scanner.close(); // Close the Scanner to avoid resource leaks
  }
}

