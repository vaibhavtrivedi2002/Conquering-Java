import java.util.Random;

public class CoinToss {

  public static void main(String[] args) {
    Random random = new Random();
    boolean isHeads = random.nextBoolean();

    if (isHeads) {
      System.out.println("It's heads!");
    } else {
      System.out.println("It's tails!");
    }
  }
}
