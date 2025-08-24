
import java.util.Scanner;

public class Ternary_Operator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Any Number : ");
        int number = sc.nextInt();

        // Ternary Operator
        String type = (number % 2 == 0) ? "Even" : "No";

        System.out.println(type); 
    }
}
