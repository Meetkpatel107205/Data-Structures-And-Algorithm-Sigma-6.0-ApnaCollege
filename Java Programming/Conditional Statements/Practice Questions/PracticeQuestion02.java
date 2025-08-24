
import java.util.Scanner;

public class PracticeQuestion02
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Your Body Temperature : ");
        double temp = sc.nextDouble();

        if(temp > 100)
        {
            System.out.println("You Have Fear");
        }
        else
        {
            System.out.println("You Don't Have Fear");
        }
    }    
}
