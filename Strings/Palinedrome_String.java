
import java.util.Scanner;

public class Palinedrome_String {

    public static boolean checkPalinedrome(String str)
    {
        int left = 0, right = str.length() - 1;

        boolean result = true;

        while(left <= right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                result = false;
                break;
            }
            left++;
            right--;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Any String : ");
        String str = sc.nextLine();

        boolean ans = checkPalinedrome(str);

        if(ans)
        {
            System.out.println("\nChecking Whether String \"str\" is Palinedrome or Not ? : " + ans);
        }
        else
        {
            System.out.println("\nChecking Whether String \"str\" is Palinedrome or Not ? : " + ans);
        }

        sc.close();
    }
}
