public class sleep{
  public static void main(String[] args) throws InterruptedException {
    for (int i = 0; i < 5; i++) {
      System.out.println("Iteration " + (i + 1));
      Thread.sleep(1000); // Sleep for 1 second
    }
  }
}
