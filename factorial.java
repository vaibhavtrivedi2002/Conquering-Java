//this program calculates factorial of a number
public class factorial {

  public static long calculateFactorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * calculateFactorial(n - 1);
    }
  }

  public static void main(String[] args) {
    int number = 5;
    long factorial = calculateFactorial(number);
    System.out.println("Factorial of " + number + " is: " + factorial);
  }
}

