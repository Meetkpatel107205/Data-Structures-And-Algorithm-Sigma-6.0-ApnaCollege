import java.util.Scanner;

public class PracticeQuestion02 {

    public static boolean isEven(int n)
    {
        return (n % 2 == 0) ? true : false;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // Create Scanner object
        int num;

        System.out.print("Enter an integer: ");
        num = sc.nextInt();  // Read input integer

        // Check even or odd
        if (isEven(num))
        {
            System.out.println("\nNumber is even");
        }
        else
        {
            System.out.println("\nNumber is odd");
        }

        sc.close();
    }
}