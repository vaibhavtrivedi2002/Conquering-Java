public class throwthrows{

  // This method throws an ArithmeticException if num is zero
  public static void divideByZero(int num) throws ArithmeticException {
    if (num == 0) {
      throw new ArithmeticException("Division by zero is not allowed!");
    }
    System.out.println("Result: " + (10 / num));
  }

  // This method uses divideByZero and handles the potential exception
  public static void safeDivide(int num) {
    try {
      divideByZero(num);
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public static void main(String[] args) {
    // Calling safeDivide with different values
    safeDivide(5);
    safeDivide(0);
  }
}
