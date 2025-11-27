import java.util.Scanner;

public class PracticeQuestion03 {

    public static int countDigits(int n)
    {
        int digit = 0;

        while(n > 0)
        {
            digit++;
            n = n / 10;
        }

        return digit;
    }

    public static int reverseNumber(int n)
    {
        int revNum = 0;
        int pow = countDigits(n) - 1;

        while(n > 0)
        {
            int lastDigit = n % 10;
            revNum = revNum + (lastDigit * (int)Math.pow(10, pow));
            pow--;
            n = n / 10;
        }

        return revNum;
    }

    // public static int reverseNumber(int n)
    // {
    //     int rev = 0;
        
    //     while(n > 0)
    //     {
    //         rev = rev * 10 + (n % 10);
    //         n /= 10;
    //     }
        
    //     return rev;
    // }

    // Method - 1 :-
    public static boolean checkPalinedrome(int n)
    {
        if(n < 0) return false; // Optional: negative numbers not palindrome
        // return (n == reverseNumber(n)) ? true : false;
        return (n == reverseNumber(n));
    }

    // Method - 2 :-
    // Method to check if number is palindrome
    public static boolean isPalindrome(int number) {

        int palindrome = number;  // Copy input
        int reverse = 0;

        while (palindrome != 0) {

            int remainder = palindrome % 10;   // Get last digit
            reverse = reverse * 10 + remainder; // Build reverse number
            palindrome = palindrome / 10;  // Remove last digit
        }

        // After full reverse is completed, compare it
        return number == reverse;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter a number: ");
        int palindrome = sc.nextInt();

        if (checkPalinedrome(palindrome))
        {
            System.out.println("\nNumber: " + palindrome + " is a palindrome");
        }
        else
        {
            System.out.println("\nNumber: " + palindrome + " is not a palindrome");
        }

        sc.close();
    }
}
