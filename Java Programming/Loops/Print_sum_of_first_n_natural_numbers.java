
import java.util.Scanner;

public class Print_sum_of_first_n_natural_numbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Any Number : ");
        int n = sc.nextInt();

        int counter = 1;

        int sumOfNNatural = 0;

        while(counter <= n)
        {
            sumOfNNatural += counter;
            counter++;
        }

        System.out.println("\nSum of first " + n + " natural numbers is : " + sumOfNNatural);

        sc.close();
    }    
}
