import java.util.Arrays;

public class median{

    public static void main(String[] args) {
        int[] data = {1, 3, 5, 3, 7, 9}; // Sample data set
        double median = calculateMedian(data);
        System.out.println("Median: " + median);
    }

    public static double calculateMedian(int[] data) {
        Arrays.sort(data);
        int length = data.length;
        if (length % 2 == 0) {
            return (data[length / 2 - 1] + data[length / 2]) / 2.0;
        } else {
            return data[length / 2];
        }
    }
}
