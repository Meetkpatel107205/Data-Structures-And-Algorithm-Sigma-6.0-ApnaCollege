import java.util.Scanner;

public class PracticeQuestion05 {

    public static int sumOfDigits(int n)
    {
        int sum = 0;

        while(n > 0)
        {
            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input an integer: ");
        int digits = sc.nextInt();

        System.out.println("\nThe sum is " + sumOfDigits(digits));

        sc.close();
    }
}