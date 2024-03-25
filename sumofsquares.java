public class sumofsquares {

    public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4};
    int index1 = 0;
    int index2 = 1;
   
    int sumOfSquares = arr[index1] * arr[index1] + arr[index2] * arr[index2];
   
    System.out.println("Sum of squares of elements at indices " + index1 + " and " + index2 + ": " + sumOfSquares);
    }
   }