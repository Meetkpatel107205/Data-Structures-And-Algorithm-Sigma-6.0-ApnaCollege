
import java.util.Scanner;

public class Print_Inverted_Star_Pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter Any Number : ");
        int n = sc.nextInt();

        System.out.println();

        for(int i = 1; i <= n; i++)
        {
            for(int s = 1; s <= (n - i + 1); s++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }    
}