
import java.util.Scanner;

public class Print_Character_Pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter Any Number : ");
        int n = sc.nextInt();

        char ch = 'A';

        System.out.println();

        for(int line = 1; line <= n; line++)
        {
            for(int chars = 1; chars <= line; chars++)
            {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

        sc.close();
    }    
}