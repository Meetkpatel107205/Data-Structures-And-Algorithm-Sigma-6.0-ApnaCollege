
import java.util.Scanner;

public class Spiral_Matrix {

    public static void printSpiralMatrix(int[][] matrix)
    {
        int startRow = 0;
        int endRow = matrix.length - 1; // Gives Number of Rows in Matrix 2D Array.
        int startColumn = 0;
        int endColumn = matrix[0].length - 1; // Gives Number of Columns in Matrix 2D Array.

        System.out.println("---: Printing Element's of 2D Array(Matrix) in Spiral Matrix Pattern :---\n");

        // Output
        while(startRow <= endRow && startColumn <= endColumn)
        {
            // j -> Columns
            // i -> Rows

            // Top
            for(int j = startColumn; j <= endColumn; j++)
            {
                System.out.print(matrix[startRow][j] + " ");
            }

            // Right
            for(int i = startRow + 1; i <= endRow; i++)
            {
                System.out.print(matrix[i][endColumn] + " ");
            }

            // Bottom
            for(int j = endColumn - 1; j >= startColumn; j--)
            {
                if(startRow == endRow)
                {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // Left
            for(int i = endRow - 1; i > startRow; i--)
            {
                if(startColumn == endColumn)
                {
                    break;
                }
                System.out.print(matrix[i][startColumn] + " ");
            }

            startRow++;
            endRow--;
            startColumn++;
            endColumn--;
        }
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

        printSpiralMatrix(matrix);

        sc.close();
    }
}
