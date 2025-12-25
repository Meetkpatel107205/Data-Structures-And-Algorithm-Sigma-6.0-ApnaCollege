
import java.util.Scanner;

public class Inverted_Half_Pyramid_with_Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Number of Rows : ");
        int n = sc.nextInt();

        System.out.println("\n");

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < (n - i); j++)
            {
                System.out.print(j + 1);
            }
            System.out.println(" ");
        }

        sc.close();

    }
}
