
import java.util.Scanner;

public class Check_Prime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Any Number : ");
        int n = sc.nextInt();

        if(n == 2)
        {
            System.out.println(n + " is a Prime Number");
        }
        else
        {
            boolean isPrime = true;

            for(int i = 2; i <= (n - 1); i++)
            {
                if(n % i == 0) // n is multiple of i (where i is not equal to 1 or n)
                {
                    isPrime = false;
                }
            }

            if(isPrime)
            {
                System.out.println(n + " is a Prime Number");
            }
            else
            {
                System.out.println(n + " is Not a Prime Number");
            }
        }
    }    
}