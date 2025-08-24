
import java.util.Scanner;

public class Switch_Statement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nPress \"1\" for Buying \"Samosa\".");
        System.out.println("Press \"2\" for Buying \"Burger\".");
        System.out.println("Press \"3\" for Buying \"Mango Shake\".");

        System.out.print("\nEnter Your Choice : ");
        int choice = sc.nextInt();

        switch (choice)
        {
            case 1: System.out.println("Samosa");
                     break;
            case 2: System.out.println("Burger");
                     break;
            case 3: System.out.println("Mango Shake");
                     break;        
            default: System.out.println("We Wake Up");
                     break;
        }
    }    
}
