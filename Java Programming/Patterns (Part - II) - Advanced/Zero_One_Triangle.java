
import java.util.Scanner;

public class Zero_One_Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Number of Rows : ");
        int n = sc.nextInt();

        System.out.println("\n");

        int printVal = 1;

        for(int i = 0; i < n; i++)
        {

            // Method - 1 :-

            // for(int j = 0; j <= i; j++) OR
            for(int j = 0; j < (i + 1); j++)
            {
                System.out.print(printVal);
                printVal = 1 - printVal;
            }

            // Method - 2 :-

            for(int j = 0; j < (i + 1); j++)
            {
                if((i + j) % 2 == 0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }

            System.out.println(" ");
        }

        sc.close();

    }
}
