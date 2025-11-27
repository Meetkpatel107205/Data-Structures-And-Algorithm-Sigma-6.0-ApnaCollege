
import java.util.Scanner;

public class Print_Half_Pyramid_Pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter Any Number : ");
        int n = sc.nextInt();

        System.out.println();

        for(int line = 1; line <= n; line++)
        {
            for(int number = 1; number <= line; number++)
            {
                System.out.print(number + " ");
            }
            System.out.println();
        }

        sc.close();
    }    
}