//this program calculates profit/loss based on selling price
import java.util.Scanner;

public class profitloss{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter purchasing rate: ");
        double purchasingRate = scanner.nextDouble();

        System.out.print("Enter selling rate: ");
        double sellingRate = scanner.nextDouble();

        double profitOrLoss = sellingRate - purchasingRate;

        if (profitOrLoss > 0) {
            System.out.println("Profit: " + profitOrLoss);
        } else if (profitOrLoss < 0) {
            System.out.println("Loss: " + Math.abs(profitOrLoss));
        } else {
            System.out.println("No profit, no loss.");
        }

        scanner.close();
    }
}
