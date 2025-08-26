
import java.util.Scanner;

public class Reverse_the_given_number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Any Number : ");
        int num = sc.nextInt();

        int rev = 0;

        int n_duplicate = num;

        while(n_duplicate > 0)
        {
            int last = n_duplicate % 10;

            rev = (rev * 10) + last;

            n_duplicate /= 10;
        }

        System.out.println("\nNumber Entered By User(num) : " + num);
        System.out.println("Reverse of Entered Number(rev) : " + rev);

        sc.close();
    }    
}
