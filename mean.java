public class mean{
    public static void main(String[] args) {
        int[] data = {1, 3, 5, 7}; // Sample data set
        double mean = calculateMean(data);
        System.out.println("Mean: " + mean);
    }

    public static double calculateMean(int[] data) {
        double sum = 0;
        for (int num : data) {
            sum += num;
        }
        return sum / data.length;
    }
}
