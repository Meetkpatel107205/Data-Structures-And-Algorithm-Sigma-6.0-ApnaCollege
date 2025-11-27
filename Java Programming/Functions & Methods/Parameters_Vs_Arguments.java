
import java.util.Scanner;

public class Parameters_Vs_Arguments {

    public static int calculateSum(int x, int y) // <--- Parameters OR Formal Parameters
    {
        int sum = x + y;

        return sum;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Number - 1 : ");
        int a = sc.nextInt();

        System.out.print("Enter Number - 2 : ");
        int b = sc.nextInt();

        int resultOfSum = calculateSum(a, b); // <--- Arguments OR Actual Parameters

        System.out.println("\nSum = " + resultOfSum);

        sc.close();
    }
}
