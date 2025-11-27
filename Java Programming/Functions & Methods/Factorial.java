
import java.util.Scanner;

public class Factorial {

    public static int factorial(int a)
    {
        int fact = 1;

        for(int i = 1; i <= a; i++)
        {
            fact *= i;
        }

        return fact;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int val;

        System.out.print("\nEnter Any Number whose Factorial you want to find : ");
        val = sc.nextInt();

        System.out.println("\nFactorial of " + val + " is : " + factorial(val));

        sc.close();
    }
}
