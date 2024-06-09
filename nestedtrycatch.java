public class nestedtrycatch{

    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[10]); // This line will cause an IndexOutOfBoundsException

            try {
                int num = Integer.parseInt("abc"); // This line will cause a NumberFormatException
            } catch (NumberFormatException e) {
                System.out.println("Inner catch block: NumberFormatException occurred");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Outer catch block: ArrayIndexOutOfBoundsException occurred");
        }
    }
}
