
import java.util.Scanner;

public class PracticeQuestion02
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;

        System.out.print("\nHow Many Numbers you want to Enter : ");
        int n = sc.nextInt();

        System.out.println();

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter Any Number : ");
            int temp = sc.nextInt();

            if(temp % 2 == 0)
            {
                evenSum += temp;
            }
            else
            {
                oddSum += temp;
            }
        }

        System.out.println("\nOdd Numbers Sum : " + oddSum);
        System.out.println("Even Numbers Sum : " + evenSum);

        sc.close();
    }    
}