
import java.util.Scanner;

public class Print_Square_Pattern_While_Loop
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Any Number : ");
        int n = sc.nextInt();

        System.out.println(" ");

        int i = 0;

        while(i < n)
        {
            int j = 0;

            while(j < n)
            {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }

        sc.close();
    }    
}
