//this program calculates the average of given numbers in an array
public class avgcalculator {

    public static void main(String[] args) {

        // Define an array of numbers
        int[] numbers = {10, 20, 30, 40};

        // Initialize variables for sum and average
        double sum = 0;
        double average;

        // Calculate the sum of the elements in the array
        for (int number : numbers) {
            sum += number;
        }

        // Calculate the average by dividing the sum by the number of elements
        average = sum / numbers.length;

        // Print the average value
        System.out.println("The average of the numbers is: " + average);
    }
}
