
import java.util.Scanner;

public class Print_Reverse_of_a_number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Any Number : ");
        int n = sc.nextInt();

        int n_duplicate = n;

        System.out.print("\nReverse of Number " + n + " is : ");

        while(n_duplicate > 0)
        {
            int last = n_duplicate % 10;

            System.out.print(last);

            n_duplicate /= 10;
        }

        sc.close();
    }    
}