class FinalDemo {

  // Final variable (constant)
  public static final double PI = 3.14159;

  // Final method (cannot be overridden)
  public final void showInfo() {
    System.out.println("PI value: " + PI);
  }
}

class FinalChild extends FinalDemo {
  // Can't override showInfo() because it's final
  // public void showInfo() { ... }
}

public class final{
  public static void main(String[] args) {
    FinalDemo obj = new FinalDemo();
    obj.showInfo();
  }
}
