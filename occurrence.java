public class occurrence{

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2};
        int elementToFind = 2;
        int count = 0;

        for (int num : arr) {
            if (num == elementToFind) {
                count++;
            }
        }

        System.out.println("Number of occurrences of " + elementToFind + ": " + count);
    }
}
