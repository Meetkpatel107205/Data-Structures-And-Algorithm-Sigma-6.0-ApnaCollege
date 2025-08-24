
import java.util.Scanner;

public class PracticeQuestion03
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Week Number : ");
        int weekNumber = sc.nextInt();

        switch (weekNumber) {
            case 1:
            {
                System.out.println("\nMonday");
                break;
            }
            case 2:
            {
                System.out.println("\nTuesday");
                break;
            }
            case 3:
            {
                System.out.println("\nWednesday");
                break;
            }
            case 4:
            {
                System.out.println("\nThursday");
                break;
            }
            case 5:
            {
                System.out.println("\nFriday");
                break;
            }
            case 6:
            {
                System.out.println("\nSaturday");
                break;
            }
            case 7:
            {
                System.out.println("\nSunday");
                break;
            }
            default:
            {
                System.out.println("Invalid Week Number");
                break;
            }
        }
    }
}