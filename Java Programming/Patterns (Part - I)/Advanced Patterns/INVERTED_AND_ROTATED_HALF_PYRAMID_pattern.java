
import java.util.Scanner;

public class INVERTED_AND_ROTATED_HALF_PYRAMID_pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter Any Number : ");
        int n = sc.nextInt();

        System.out.println();

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < (n - i - 1); j++)
            {
                System.out.print("  ");
            }

            for(int k = 0; k <= i; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }    
}
