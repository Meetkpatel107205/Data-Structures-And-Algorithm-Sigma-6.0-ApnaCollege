
import java.util.Scanner;

public class Convert_Every_First_Letter_to_Uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Any Text : ");
        String str = sc.nextLine();

        StringBuilder strB = new StringBuilder("");
        
        char firstChar = Character.toUpperCase(strB.charAt(0));

        strB.append(firstChar);

        // Method - 1 :-
        // for(int i = 1; i < str.length(); i++)
        // {
        //     if((str.charAt(i - 1) >= 65 && str.charAt(i - 1) <= 90) || (strB.charAt(i - 1) >= 97 &&  strB.charAt(i - 1) <= 122))
        //     {
        //         strB.append(str.charAt(i));
        //     }
        //     else
        //     {
        //         strB.append(Character.toUpperCase(strB.charAt(i)));
        //     }
        // }

        // Method - 2 :-
        for(int i = 1; i < str.length(); i++)
        {
            if(str.charAt(i) == ' ' && i < str.length() - 1)
            {
                strB.append(str.charAt(i));
                i++;
                strB.append(Character.toUpperCase(str.charAt(i)));
            }
            else
            {
                strB.append(str.charAt(i));
            }
        }

        System.out.println("\nFinal Resultant String : " + strB.toString());

        sc.close();
    }
}
