
import java.util.Scanner;

public class PracticeQuestion_01 {

    public static int numberOf7s(int[][] arr)
    {
        int count7 = 0;

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                if(arr[i][j] == 7)
                {
                    count7++;
                }
            }
        }

        return count7;
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

        int result = numberOf7s(matrix);

        System.out.println("\nTotal Number of 7's in given 2D Array = " + result);

        sc.close();
    }
}
