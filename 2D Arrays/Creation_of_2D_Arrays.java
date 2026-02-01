
import java.util.Scanner;

public class Creation_of_2D_Arrays {

    public static boolean search(int matrix[][], int key)
    {
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                if(matrix[i][j] == key)
                {
                    System.out.println("\nFound at Cell (" + i + ", " + j + ")");
                    return true;
                }
            }
        }

        System.out.println("\nNot Found");
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Number of Rows for 2D Array(Matrix) : ");
        int Rows = sc.nextInt();

        System.out.print("Enter Number of Columns for 2D Array(Matrix) : ");
        int Columns = sc.nextInt();
        
        int matrix[][] = new int[Rows][Columns];
        int  n = matrix.length, m = matrix[0].length;

        System.out.println("\n---: Enter Element's of 2D Array(Matrix) :---\n");

        // Input
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();
            }

            System.out.println(" ");
        }

        System.out.println("---: Printing Element's of 2D Array(Matrix) :---\n");

        // Output
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println(" ");
        }

        System.out.print("\nEnter Target Element : ");
        int target = sc.nextInt();

        boolean found =  search(matrix, target);

        System.out.println("Found = " + found);

        sc.close();
    }
}
