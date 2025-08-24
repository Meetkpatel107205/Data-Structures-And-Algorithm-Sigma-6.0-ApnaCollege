
import java.util.Scanner;

public class Pass_or_Fail
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Marks : ");
        int marks = sc.nextInt();

        String reportCard = (marks >= 33) ? "Pass" : "Fail";

        System.out.println("Result = " + reportCard);
    }    
}
