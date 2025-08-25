
import java.util.Scanner;

public class incomeTaxCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int income;
        int tax;

        System.out.print("\nEnter Your Income : ");
        income = sc.nextInt();

        if(income < 500000)
        {
            tax = 0;
        }
        else if(income >= 500000 && income <= 1000000) // OR else if(income <= 1000000)
        {
            tax = (int)(income * 0.2);
        }
        else
        {
            tax = (int)(income * 0.3);
        }

        int incomeAfterTaxDeduct = income - tax;

        System.out.println("\nTax Amount = " + tax);
        System.out.println("Income After Deducting Tax Amount = " + incomeAfterTaxDeduct);

        sc.close();
    }
}
