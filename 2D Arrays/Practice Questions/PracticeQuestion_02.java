
import java.util.Scanner;

public class PracticeQuestion_02 {

    public static int sumOfSecRow(int[][] arr)
    {
        int sumOfSecRow = 0;

        for(int j = 0; j < arr[1].length; j++)
        {
            sumOfSecRow += arr[1][j];
        }

        return sumOfSecRow;
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

        int result = sumOfSecRow(matrix);

        System.out.println("\nSum of all Element's Present in Second Row of Given 2D Array = " + result);

        sc.close();
    }
}
