
import java.util.Scanner;

public class NUMBER_PYRAMID_pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nEnter Number of Rows : ");
        int n = sc.nextInt();

        System.out.println(" ");

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < (n - i - 1); j++)
            {
                System.out.print(" ");
            }

            for(int k = 0; k <= i; k++)
            {
                System.out.print((i + 1) + " ");
            }

            System.out.println(" ");
        }

        sc.close();
    }
}
