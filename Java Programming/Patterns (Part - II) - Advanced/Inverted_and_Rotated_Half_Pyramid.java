
import java.util.Scanner;

public class Inverted_and_Rotated_Half_Pyramid {
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

            // for(int k = 0; k <= i; k++) OR
            for(int k = 0; k < (i + 1); k++)
            {
                System.out.print("*");
            }

            System.out.println(" ");
        }

        sc.close();

    }
}