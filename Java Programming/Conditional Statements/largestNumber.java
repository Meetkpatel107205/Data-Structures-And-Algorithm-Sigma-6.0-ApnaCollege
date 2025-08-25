
import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Number - 1 : ");
        int num1 = sc.nextInt();

        System.out.print("Enter Number - 2 : ");
        int num2 = sc.nextInt();

        if(num1 > num2)
        {
            System.out.println("\nLargest Number is " + num1);
        }
        else
        {
            System.out.println("\nLargest Number is " + num2);
        }

        sc.close();
    }
}
