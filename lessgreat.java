//this program compares value of two numbera(less,great or equal)
import java.util.Scanner;

public class lessgreat {
    public static void main(String[] args) {
        Scanner likh = new Scanner(System.in);
        
        System.out.println("Enter the value of a:");
        int a= likh.nextInt();

        System.out.println("Enter the value of b:");
        int b= likh.nextInt();

        if(a==b){
            System.out.println("a and b are equal");
        }else if(a>b){
                System.out.println("a is greater than b");
            }else{
                System.out.println("b is greater than a");
            }
        }
    }

