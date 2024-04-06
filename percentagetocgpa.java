//this program converts percentage to cgpa
public class percentagestocgpa {

    public static void main(String[] args) {
        // Assuming percentage is a double value between 0 and 100
        double percentage = 85.5;

        // CGPA conversion factor (may vary depending on university)
        double conversionFactor = 9.5;

        // Calculate CGPA
        double cgpa = percentage / 100 * conversionFactor;

        // Display the CGPA
        System.out.println("CGPA: " + cgpa);
    }
}
