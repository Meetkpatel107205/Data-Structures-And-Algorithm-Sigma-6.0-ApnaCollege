
import java.util.Scanner;

public class Largest_String_Lexicographically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter First String : ");
        String str1 = sc.nextLine();

        System.out.print("\nEnter Second String : ");
        String str2 = sc.nextLine();

        // Java Pre-Defined Compare Function to Comparing Two Strings Lexicographically.
        // Syntax : str1.compareTo(str2);
        // Results => 0 : equal, < 0 : -ve (str1 < str2), < 0 : +ve (str1 > str2).
        // If letters are same then give output according to ASCII Value.

        // compareToIgnoreCase() : Ignore case of letters while comparing(Treas 'A' and 'a' as same letters).
        // Syntax : str1.compareTo(str2);
        // Results => 0 : equal, < 0 : -ve (str1 < str2), < 0 : +ve (str1 > str2).

        int compareResult = str1.compareTo(str2);
        int compareResult2 = str1.compareToIgnoreCase(str2);

        System.out.println("\n---: Comparing with Case :---");

        if(compareResult == 0)
        {
            System.out.println("\n\"str1\" and \"str2\" are equal.");
        }
        else if(compareResult > 0)
        {
            System.out.println("\n\"str1\" is Larger");
        }
        else
        {
            System.out.println("\n\"str2\" is Larger");
        }

        System.out.println("\n---: Comparing with Ignoring Case :---");

        if(compareResult2 == 0)
        {
            System.out.println("\n\"str1\" and \"str2\" are equal.");
        }
        else if(compareResult2 > 0)
        {
            System.out.println("\n\"str1\" is Larger");
        }
        else
        {
            System.out.println("\n\"str2\" is Larger");
        }

        sc.close();
    }
}
