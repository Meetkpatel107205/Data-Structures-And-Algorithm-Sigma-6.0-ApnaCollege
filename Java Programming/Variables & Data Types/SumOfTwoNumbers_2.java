
import java.util.*;
public class SumOfTwoNumbers_2
{
    public static void main(String args[])
    {
        // code to calculate sum
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number - 1 : ");
        int a = sc.nextInt();

        System.out.print("Enter Number - 2 : ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("\nNumber - 1 = " + a);
        System.out.println("Number - 2 = " + b);
        System.out.println("\nSum = " + sum);
    }
}
