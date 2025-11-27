
import java.util.Scanner;

public class Syntax_With_Parameters {

    public static int calculateSum(int x, int y)
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

        int resultOfSum = calculateSum(a, b);

        System.out.println("\nSum = " + resultOfSum);

        sc.close();
    }
}
