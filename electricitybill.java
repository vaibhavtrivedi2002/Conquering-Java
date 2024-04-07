//this program can calculate your electricity bill
import java.util.Scanner;

public class electricitybill {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter previous units: ");
    int previousUnits = scanner.nextInt();

    System.out.println("Enter current units: ");
    int currentUnits = scanner.nextInt();

    int unitsConsumed = currentUnits - previousUnits;
    double billAmount = unitsConsumed * 5;

    System.out.println("Electricity Bill:");
    System.out.println("Units Consumed: " + unitsConsumed);
    System.out.println("Amount Payable: Rs. " + billAmount);
  }
}
