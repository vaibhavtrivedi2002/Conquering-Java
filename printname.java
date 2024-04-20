import java.util.Scanner;

public class printname {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    for (char letter : name.toCharArray()) {
      System.out.println(letter);
    }
  }
}
