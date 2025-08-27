
import java.util.Scanner;

public class PracticeQuestion03
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter A Number Whoose Factorial You Want to Find : ");
        int n = sc.nextInt();

        int fact = 1;

        for(int i = 1; i <= n; i++)
        {
            fact *= i;
        }

        System.out.println("\nFactorial of Number " + n + " is : " + fact);

        sc.close();
    }    
}