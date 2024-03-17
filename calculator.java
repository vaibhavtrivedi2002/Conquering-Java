import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double number1 = scanner.nextDouble();

        System.out.println("Choose an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter second number: ");
        double number2 = scanner.nextDouble();

        double result;
        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 == 0) {
                    System.out.println("Error: Division by zero");
                    return;
                }
                result = number1 / number2;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
        scanner.close();
    }
}
