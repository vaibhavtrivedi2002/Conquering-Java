//this program converts degree celcius to fahrenheit
import java.util.Scanner;

public class degtofah{

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter temperature in Celsius: ");
    double celsius = scanner.nextDouble();

    double fahrenheit = (celsius * 1.8) + 32;

    System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit");
  }
}
