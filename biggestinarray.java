//this program prints largest element(int) present in an array
import java.util.Arrays;
public class biggestinarray{
    public static void main(String[] args) {
        int[] array= {22,25,78,65,97};
        int largest= Arrays.stream(array).max().getAsInt();
        System.out.println("The largest element in the array is:"+largest);
    }
    
}
