
import java.util.Scanner;

public class PracticeQuestion01
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Any Number : ");
        int number = sc.nextInt();

        if(number > 0)
        {
            System.out.println("\nPositive");
        }
        else if(number < 0)
        {
            System.out.println("\nNegative");
        }
        else
        {
            System.out.println("\nZero");
        }
    }    
}
