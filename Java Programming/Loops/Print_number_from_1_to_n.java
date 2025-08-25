
import java.util.Scanner;

public class Print_number_from_1_to_n
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Any Number : ");
        int n = sc.nextInt();

        int counter = 1;

        while(counter <= n)
        {
            System.out.print(counter + " ");
            counter++;
        }
    }    
}
