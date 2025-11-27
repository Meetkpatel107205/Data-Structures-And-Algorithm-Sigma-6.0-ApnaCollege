
import java.util.Scanner;

public class PracticeQuestion01 {

    public static double average(double x, double y, double z)
    {
        return (x + y + z) / 3.0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first number: ");
        double x = sc.nextDouble();  // Read first number

        System.out.print("Input the second number: ");
        double y = sc.nextDouble();  // Read second number

        System.out.print("Input the third number: ");
        double z = sc.nextDouble();  // Read third number

        // Printing the average
        System.out.println("\nThe average value is " + average(x, y, z));

        sc.close();
    }
}