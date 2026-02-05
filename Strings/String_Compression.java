
import java.util.Scanner;

public class String_Compression {

    public static String stringCompression(String s)
    {
        String newStr = "";

        for(int i = 0; i < s.length(); i++)
        {
            Integer count = 1;

            while(i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1))
            {
                count++;
                i++;
            }

            newStr += s.charAt(i);

            if(count > 1)
            {
                newStr += count.toString();
            }
        }

        return newStr;
    }

    public static String stringCompression2(String s)
    {
        StringBuilder newStr = new StringBuilder("");

        for(int i = 0; i < s.length(); i++)
        {
            Integer count = 1;

            while(i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1))
            {
                count++;
                i++;
            }

            newStr.append(s.charAt(i));

            if(count > 1)
            {
                newStr.append(count.toString());
            }
        }

        return newStr.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Any String : ");
        String str = sc.nextLine();

        String resStr = stringCompression(str);

        System.out.println("\nAfter Compressing String : " + resStr);

        String resStr2 = stringCompression2(str);

        System.out.println("\nAfter Compressing String using string as StringBuilder : " + resStr2);

        sc.close();
    }
}