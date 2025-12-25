
import java.util.Scanner;

public class Hollow_Rhombus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Number of Rows : ");
        int n = sc.nextInt();

        System.out.println("\n");

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < (n - i - 1); j++)
            {
                System.out.print(" ");
            }

            for(int k = 0; k < n; k++)
            {
                if(i == 0 || i == (n - 1) || k == 0 || k == (n - 1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            System.out.println(" ");
        }

        sc.close();

    }
}
