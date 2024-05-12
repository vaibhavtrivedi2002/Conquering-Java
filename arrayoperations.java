import java.util.ArrayList;

public class arrayoperations {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();

    // Adding elements
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);

    System.out.println("Elements in the ArrayList: " + numbers);

    // Removing elements
    numbers.remove(1); // Removes element at index 1 (20)

    System.out.println("Elements after removing: " + numbers);
  }
}
