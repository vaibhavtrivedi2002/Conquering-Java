//this program prints Namaste, Hello, Bonjour using if/else and switch cases
import java.util.*;
public class greet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int press = scanner.nextInt();
        //if(press == 1){
            //System.out.println("Namaste");
        //}else if(press == 2){
                //System.out.println("Hello");
            //}else if(press ==3){
                //System.out.println("Bonjour");
            //}

            switch(press){
                case 1: System.out.println("Namaste");
                break;
                case 2: System.out.println("Hello");
                break;
                case 3: System.out.println("Bonjour");
                break;
                default: System.out.println("No Result");
                break;

            }
    }
    
}
