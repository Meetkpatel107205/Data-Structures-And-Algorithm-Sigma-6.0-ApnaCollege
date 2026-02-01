
import java.util.Scanner;

public class Diagonal_Sum {

    // Method - 1 :-

    // public static int diagonalSum(int[][] matrix)
    // {
    //     int sum = 0;

    //     for(int i = 0; i < matrix.length; i++)
    //     {
    //         for(int j = 0; j < matrix[0].length; j++)
    //         {
    //             if(i == j)
    //             {
    //                 sum += matrix[i][j];
    //             }
    //             else if(i + j == matrix.length - 1)
    //             {
    //                 sum += matrix[i][j];
    //             }
    //         }
    //     }

    //     return sum;
    // }

    // Method - 2 :-

    public static int diagonalSum(int[][] matrix)
    {
        int sum = 0;

        for(int i = 0; i < matrix.length; i++)
        {
            // Primary Diagonal
            sum += matrix[i][i];

            // Secondary Diagonal
            if(i != matrix.length-1-i)
            {
                sum += matrix[i][matrix.length-i-1];
            }
        }

        return sum;
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

        int result = diagonalSum(matrix);

        System.out.println("\nDiagonal Sum(Primary Sum + Secondary Sum) = " + result);

        sc.close();
    }
}
