//this program converts your string in integer values
import java.util.Scanner;
public class stringtoint{

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String inputString = scanner.nextLine();

    StringBuilder convertedString = new StringBuilder();
    for (char character : inputString.toCharArray()) {
      if (Character.isLetter(character)) {
        int position = getPosition(character);
        convertedString.append(position).append(" ");
      } else {
        convertedString.append(character).append(" ");
      }
    }

    System.out.println("Converted string: " + convertedString.toString().trim());
  }

  public static int getPosition(char alphabet) {
    if (alphabet < 'a' || alphabet > 'z') {
      return -1;
    }
    return alphabet - 'a' + 1;
  }
}
