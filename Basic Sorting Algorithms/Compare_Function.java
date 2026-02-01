import java.util.Scanner;

public class Compare_Function {

    public static int compare(int a, int b)
    {
        // a < b -> -ve
        // a == b -> 0
        // a > b -> +ve
        return (a - b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter First Number : ");
        int x = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int y = sc.nextInt();

        System.out.println("\nComparison of X = " + x + " And Y = " + y + " is : " + compare(x, y));

        sc.close();

    }
}
