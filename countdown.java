class countdown{

  static void countdown(int n) {
    if (n == 0) {
      System.out.println("Blastoff!");
    } else {
      System.out.println(n);
      countdown(n - 1);
    }
  }

  public static void main(String[] args) {
    int count = 5;
    countdown(count);
  }
}
