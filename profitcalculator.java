//this program calculates the total profit earned
public class profitcalculator{

    public static double calculateProfit(double costPrice, double sellingPrice) {
        if (sellingPrice <= costPrice) {
            System.out.println("Selling price cannot be less than or equal to cost price.");
            return 0;
        } else {
            return sellingPrice - costPrice;
        }
    }

    public static void main(String[] args) {
        double costPrice = 100;
        double sellingPrice = 120;
        double profit = calculateProfit(costPrice, sellingPrice);
        System.out.println("The profit made is: ₹" + profit);
    }
}
