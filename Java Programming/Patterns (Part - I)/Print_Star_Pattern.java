
import java.util.Scanner;

public class Print_Star_Pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Number of Rows(Lines) : ");
        int rows = sc.nextInt();

        System.out.println();

        for(int line = 1; line <= rows; line++)
        {
            for(int star = 1; star <= line; star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
