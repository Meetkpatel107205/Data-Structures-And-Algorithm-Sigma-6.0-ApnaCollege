import java.util.Scanner;

public class Hollow_Rectangle_Pattern {

    public static void hollow_rectangle(int totRows, int totCols)
    {
        // Outer Loop - Rows
        for(int i = 1; i <= totRows; i++)
        {
            // Inner Loop - Columns
            for(int j = 1; j <= totCols; j++)
            {
                // Cell - (i, j)
                if(i == 1 || j == 1 || i == (totRows) || j == (totCols))
                {
                    // Boundary Cells
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            System.out.println(" ");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Number of Rows : ");
        int r = sc.nextInt();

        System.out.print("Enter Number of Columns : ");
        int c = sc.nextInt();

        System.out.println(" ");

        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                if(i == 0 || j == 0 || i == (r - 1) || j == (c - 1))
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

        System.out.println(" ");

        // hollow_rectangle(10, 7);

        sc.close();
    }
}
