class MyThread extends Thread {
  @Override
  public void run() {
    for (int i = 1; i <= 5; i++) {
      try {
        Thread.sleep(1000);
        System.out.println("Iteration " + i);
      } catch (InterruptedException e) {
        System.out.println("Thread interrupted!");
        break;
      }
    }
  }
}

public class interrupt{
  public static void main(String[] args) throws InterruptedException {
    MyThread thread = new MyThread();
    thread.start();

    Thread.sleep(2000);
    thread.interrupt();
  }
}
