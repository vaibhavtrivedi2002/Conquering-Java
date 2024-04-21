//this program tells you the given spelling is correct or incorrect 
import java.util.Scanner;

public class spellchecker {

    public static void main(String[] args) {

        String originalWord = "dictionary"; // Replace with your desired word

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the spelled word: ");
        String userWord = scanner.nextLine();

        if (originalWord.equalsIgnoreCase(userWord)) {
            System.out.println("Correct spelling");
        } else {
            System.out.println("Incorrect spelling");
        }
    }
}
