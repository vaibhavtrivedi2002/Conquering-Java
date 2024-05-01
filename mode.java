public class mode{

  public static int findMode(int[] data) {
    int maxValue = 0;
    int maxCount = 0;

    for (int i = 0; i < data.length; i++) {
      int count = 1;
      for (int j = i + 1; j < data.length; j++) {
        if (data[i] == data[j]) {
          count++;
        }
      }
      if (count > maxCount) {
        maxCount = count;
        maxValue = data[i];
      }
    }
    return maxValue;
  }

  public static void main(String[] args) {
    int[] data = {3, 1, 4, 1, 5, 9, 3, 2, 1};
    int mode = findMode(data);
    System.out.println("The mode of the data is: " + mode);
  }
}
