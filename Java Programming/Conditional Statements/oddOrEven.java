
import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Any Number : ");
        int num = sc.nextInt();

        if(num % 2 == 0)
        {
            System.out.println("\nNumber " + num + " is Even Number");
        }
        else
        {
            System.out.println("\nNumber " + num + " is Odd Number");
        }

        sc.close();
    }
}
