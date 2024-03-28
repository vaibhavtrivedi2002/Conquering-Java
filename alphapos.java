//this program finds the alphabet position in integers 
public class alphapos{
  public static int getPosition(char alphabet) {
    if (alphabet < 'a' || alphabet > 'z') {
      return -1;
    }
    return alphabet - 'a' + 1;
  }

  public static void main(String[] args) {
    char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    for (int i = 0; i < alphabets.length; i++) {
      System.out.println("Position of '" + alphabets[i] + "' is " + (i + 1));
    }
  }
}
