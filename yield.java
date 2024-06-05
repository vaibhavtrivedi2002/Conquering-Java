class YieldDemo extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(Thread.currentThread().getName() + " in control");
      yield();
    }
  }
}

public class yield{
  public static void main(String[] args) {
    YieldDemo thread1 = new YieldDemo();
    YieldDemo thread2 = new YieldDemo();

    thread1.start();
    thread2.start();
  }
}
