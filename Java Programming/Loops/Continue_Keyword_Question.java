
import java.util.Scanner;

public class Continue_Keyword_Question
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        do
        {
            System.out.print("\nEnter Any Number : ");
            int temp = sc.nextInt();

            if(temp % 10 == 0)
            {
                continue;
            }

            System.out.println();

            System.out.println(temp);
        }while(true);
    }
}