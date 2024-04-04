//this program calculates the rate of gold
public class goldratecalculator {

    public static void main(String[] args) {
        // You'll need to replace this with the current gold rate per gram (in rupees)
        double goldRatePerGram = 5000;
        int goldPurity = 24; // 24 carats for pure gold

        double ratePerCarat = goldRatePerGram / goldPurity;

        System.out.println("Rate of gold per carat: ₹" + ratePerCarat);
    }
}
