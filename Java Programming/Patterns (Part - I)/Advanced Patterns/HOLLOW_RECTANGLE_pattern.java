
import java.util.Scanner;

public class HOLLOW_RECTANGLE_pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter Any Number : ");
        int n = sc.nextInt();

        System.out.println();

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if (i == 0 || i == (n - 1) || j == 0 || j == (n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // two spaces for alignment
                }
            }
            System.out.println();
        }

        sc.close();
    }  
}