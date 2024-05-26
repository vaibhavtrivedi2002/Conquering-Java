public class instance{

  public int add(int a, int b) {
    int sum = a + b;
    return sum;
  }

  public static void main(String[] args) {
    instance obj = new instance();
    int result = obj.add(12, 13);
    System.out.println("The sum is: " + result);
  }
}
