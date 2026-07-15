import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("\nChoose an operation:");
        System.out.println("+ : Addition");
        System.out.println("- : Subtraction");
        System.out.println("* : Multiplication");
        System.out.println("/ : Division");
        System.out.println("% : Modulus");

        System.out.print("Enter your choice: ");
        char choice = sc.next().charAt(0);

        switch (choice) {
            case '+':
                System.out.println("Result = " + (num1 + num2));
                break;

            case '-':
                System.out.println("Result = " + (num1 - num2));
                break;

            case '*':
                System.out.println("Result = " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0)
                    System.out.println("Result = " + (num1 / num2));
                else
                    System.out.println("Division by zero is not allowed.");
                break;

            case '%':
                if (num2 != 0)
                    System.out.println("Result = " + (num1 % num2));
                else
                    System.out.println("Modulus by zero is not allowed.");
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}