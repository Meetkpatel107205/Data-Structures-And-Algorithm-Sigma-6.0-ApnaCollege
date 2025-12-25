
import java.util.Scanner;

public class Floyds_Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Number of Rows : ");
        int n = sc.nextInt();

        int floydCount = 1;

        System.out.println("\n");

        for(int i = 0; i < n; i++)
        {
            // for(int j = 0; j <= i; j++) OR
            for(int j = 0; j < (i + 1); j++)
            {
                System.out.print(floydCount + " ");
                floydCount++;
            }
            System.out.println(" ");
        }

        sc.close();

    }
}
