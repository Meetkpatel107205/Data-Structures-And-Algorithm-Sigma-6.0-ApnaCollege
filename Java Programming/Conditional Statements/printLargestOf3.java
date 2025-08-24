
import java.util.Scanner;

public class printLargestOf3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int A,B,C;

        System.out.print("\nEnter First Number : ");
        A = sc.nextInt();

        System.out.print("Enter Second Number : ");
        B = sc.nextInt();

        System.out.print("Enter Third Number : ");
        C = sc.nextInt();

        // Method - 1 :-

        if(A > B)
        {
            if(A > C)
            {
                System.out.println("\nGreatest Number is " + A);
            }
            else
            {
                System.out.println("\nGreatest Number is " + C);
            }
        }
        else
        {
            if(B > C)
            {
                System.out.println("\nGreatest Number is " + B);
            }
            else
            {
                System.out.println("\nGreatest Number is " + C);
            }   
        }

        // Method - 2 :-

        // if(A >= B && A >= C)
        // {
        //     System.out.println("\nGreatest Number is " + A);
        // }
        // else if(B >= C)
        // {
        //     System.out.println("\nGreatest Number is " + B);
        // }
        // else
        // {
        //     System.out.println("\nGreatest Number is " + C);
        // }
    }    
}
