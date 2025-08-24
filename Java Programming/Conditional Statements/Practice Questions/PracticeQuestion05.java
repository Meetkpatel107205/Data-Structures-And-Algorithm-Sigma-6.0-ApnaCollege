
import java.util.Scanner;

public class PracticeQuestion05
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Any Year : ");
        int year = sc.nextInt();

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
    }    
}
