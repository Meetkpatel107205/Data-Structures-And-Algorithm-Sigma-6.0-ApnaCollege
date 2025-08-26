
import java.util.Scanner;

public class Break_Keyword_Question
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.print("\nEnter Any Number : ");
            int temp = sc.nextInt();

            if(temp % 10 == 0)
            {
                break;
            }

            System.out.println();

            System.out.println(temp);
        }

        sc.close();
    }    
}
