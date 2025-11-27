
import java.util.Scanner;

public class PALINDROMIC_Pattern_with_Numbers_pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter Number of Rows : ");
        int n = sc.nextInt();

        System.out.println(" ");

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < (n - i); j++)
            {
                System.out.print(" ");
            }

            for(int k = i; k >= 0; k--)
            {
                System.out.print((k + 1));
            }

            for(int l = 0; l <= i; l++)
            {
                if((l + 1) != 1)
                {
                    System.out.print((l + 1));
                }
                else
                {
                    continue;
                }
            }

            System.out.println(" ");
        }

        sc.close();
    }    
}
