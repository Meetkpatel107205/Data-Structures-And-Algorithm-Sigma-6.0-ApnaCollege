
import java.util.Scanner;

public class Zero_One_Triangle_pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter Any Number : ");
        int n = sc.nextInt();

        System.out.println();

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print(((i + j) % 2 == 0 ? 1 : 0) + " ");
            }
            System.out.println();
        }

        sc.close();
    }  
}