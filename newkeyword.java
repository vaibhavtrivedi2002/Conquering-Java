class Point {
  int x;
  int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void printPoint() {
    System.out.println("(" + x + ", " + y + ")");
  }
}

public class newkeyword{
  public static void main(String[] args) {
    // Create a new Point object using the new keyword
    Point point1 = new Point(10, 20);

    // Call the printPoint() method to display the coordinates
    point1.printPoint();
  }
}
