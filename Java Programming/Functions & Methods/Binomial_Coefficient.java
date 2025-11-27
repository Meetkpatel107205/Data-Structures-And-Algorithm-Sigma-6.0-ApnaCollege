
import java.util.Scanner;

public class Binomial_Coefficient {

    public static int factorial(int a)
    {
        int fact = 1;

        for(int i = 1; i <= a; i++)
        {
            fact *= i;
        }

        return fact;
    }

    public static int binCoeff(int n, int r)
    {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n - r);

        int BC = n_fact / (r_fact * nmr_fact);

        return BC;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n_val;
        int r_val;

        System.out.print("\nEnter value of n : ");
        n_val = sc.nextInt();

        System.out.print("Enter value of r : ");
        r_val = sc.nextInt();

        System.out.println("\nBinomial Coefficient C(" + n_val + ", " + r_val + ") = " + binCoeff(n_val, r_val));

        sc.close();
    }
}
