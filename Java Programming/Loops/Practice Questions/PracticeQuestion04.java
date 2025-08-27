
import java.util.Scanner;

public class PracticeQuestion04
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter A Number Whoose Multiplication Table You Want to Print : ");
        int n = sc.nextInt();

        System.out.println("\n---: Multiplication Table of " + n + " :---");

        System.out.println();

        for(int i = 1; i <= 10; i++)
        {
            System.out.println(n + " X " + i + " = " + (n * i));
        }

        sc.close();
    }    
}