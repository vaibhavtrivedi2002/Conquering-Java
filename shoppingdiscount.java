//this program gives n% of discount, where n is number of items
import java.util.Scanner;

public class shoppingdiscount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalItems = 0;
        double totalPrice = 0.0;

        // Loop to get item prices
        while (true) {
            System.out.print("Enter item price (or -1 to finish): ");
            double price = scanner.nextDouble();

            if (price == -1) {
                break;
            }

            totalItems++;
            totalPrice += price;
        }

        // Calculate discount based on number of items purchased
        double discount = totalPrice * totalItems * 0.01; // 1% discount per item

        // Calculate final amount
        double finalAmount = totalPrice - discount;

        // Display results
        System.out.println("\nTotal number of items: " + totalItems);
        System.out.printf("Total price: $%.2f\n", totalPrice);
        System.out.printf("Discount (%.0f%% per item): $%.2f\n", 1.0, discount);
        System.out.printf("Final amount: $%.2f\n", finalAmount);

        scanner.close();
    }
}
