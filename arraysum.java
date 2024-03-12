//this program counts the sum of elements present in the array
import java.util.stream.IntStream;

public class arraysum {
    public static void main(String[] args) {
        // Define the array
        int[] numbers = { 11, 29, 3, 4, 3 };

        // Calculate the sum using stream
        int sum = IntStream.of(numbers).sum();

        // Print the sum
        System.out.println("The sum of the array elements is: " + sum);
    }
}
