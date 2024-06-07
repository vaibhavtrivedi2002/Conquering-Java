class IsAliveDemo extends Thread {
  public void run() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

public class isalive{
  public static void main(String[] args) throws InterruptedException {
    IsAliveDemo thread = new IsAliveDemo();

    System.out.println("Before starting: " + thread.isAlive());

    thread.start();

    System.out.println("After starting: " + thread.isAlive());

    Thread.sleep(500);

    System.out.println("After sleeping: " + thread.isAlive());
  }
}
