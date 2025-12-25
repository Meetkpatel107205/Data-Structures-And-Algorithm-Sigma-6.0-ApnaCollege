
import java.util.Scanner;

public class Diamond_Pattern {
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

            for(int k = 0; k < ((2*i) + 1); k++)
            {
                System.out.print("*");
            }

            System.out.println(" ");
        }

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }

            for(int k = 0; k < ((2*n) - ((2*i) + 1)); k++)
            {
                System.out.print("*");
            }

            System.out.println(" ");
        }

        sc.close();

    }
}
