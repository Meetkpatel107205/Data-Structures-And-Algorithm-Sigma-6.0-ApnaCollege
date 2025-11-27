
import java.util.Scanner;

public class INVERTED_HALF_PYRAMID_with_Numbers_pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter Any Number : ");
        int n = sc.nextInt();

        System.out.println();

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < (n - i); j++)
            {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }

        sc.close();
    }    
}
