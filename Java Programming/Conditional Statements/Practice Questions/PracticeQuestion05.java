
import java.util.Scanner;

public class PracticeQuestion05
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Any Year : ");
        int year = sc.nextInt();

        // Method - 1 :-

        if (year % 400 == 0)
        {
            System.out.println("\n" + year + " is a Leap Year");
        }
        else if (year % 100 == 0)
        {
            System.out.println("\n" + year + " is Not a Leap Year");
        }
        else if (year % 4 == 0)
        {
            System.out.println("\n" + year + " is a Leap Year");
        }
        else
        {
            System.out.println("\n" + year + " is Not a Leap Year");
        }

        // Method - 2 :-

        // boolean x = (year % 4) == 0;
        // boolean y = (year % 100) != 0;
        // boolean z = ((year % 100 == 0) && (year % 400 == 0));
        
        // if(x && (y || z))
        // {
        //     System.out.println(year + " is a leap year");
        // }
        // else
        // {
        //     System.out.println(year + " is not a leap year");
        // }
    }    
}
