import java.util.Scanner;

public class Search_in_Sorted_Matrix {

    public static boolean staircaseSearch(int[][] matrix, int key)
    {
        int row = 0, col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0)
        {
            if(matrix[row][col] == key)
            {
                System.out.println("\nFound Key at (" + row + ", " + col + ")");
                return true;
            }
            else if(key < matrix[row][col])
            {
                col--;
            }
            else
            {
                row++;
            }
        }

        System.out.println("\nKey Not Found!");

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

        System.out.print("\nEnter Target Element : ");
        int target = sc.nextInt();

        boolean found =  staircaseSearch(matrix, target);

        System.out.println("Found = " + found);

        sc.close();
    }
}
