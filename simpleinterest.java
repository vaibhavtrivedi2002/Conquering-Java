public class simpleinterest {

  public static void main(String[] args) {
    int principal = 1000;
    int time = 3;
    float rate = 8.5f;

    float simpleInterest = (principal * time * rate) / 100;

    System.out.println("Simple Interest: " + simpleInterest);
  }
}
