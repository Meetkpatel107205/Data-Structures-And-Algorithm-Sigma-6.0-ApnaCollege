
import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter Number - 1 : ");
        int num1 = sc.nextInt();

        System.out.print("Enter Number - 2 : ");
        int num2 = sc.nextInt();

        System.out.println("\nPress \"+\" for Performing Addition.");
        System.out.println("Press \"-\" for Performing Subtraction.");
        System.out.println("Press \"*\" for Performing Multiplication.");
        System.out.println("Press \"/\" for Performing Division.");
        System.out.println("Press \"%\" for Performing Modulo Operation.");

        System.out.print("\nSelect the Operator : ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
            {
                System.out.println("\nAddition : " + num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            }
            case '-':
            {
                System.out.println("\nSubtraction : " + num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            }
            case '*':
            {
                System.out.println("\nMultiplication : " + num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            }
            case '/':
            {
                System.out.println("\nDivision : " + num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            }
            case '%':
            {
                System.out.println("\nModulo Operation : " + num1 + " % " + num2 + " = " + (num1 % num2));
                break;
            }
            default:
            {
                System.out.println("\nWrong Operator");
                break;
            }
        }

        sc.close();
    }
}
