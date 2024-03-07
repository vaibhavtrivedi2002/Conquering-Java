//this program input from user and identifies whether the number is odd or even
import java.util.*;
public class oddev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int x = input.nextInt();
        if(x%2 ==0){
            System.out.println("The Number is Even");
        }else{
            System.out.println("The Number is Odd");
        }
    }
}
