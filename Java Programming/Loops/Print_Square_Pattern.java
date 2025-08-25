
import java.util.Scanner;

public class Print_Square_Pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Any Number : ");
        int n = sc.nextInt();

        System.out.println(" ");

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}
