
import java.util.Scanner;

public class PracticeQuestion04 {

    public static boolean isAnagram(String s, String t)
    {
        if(s.length() != t.length())
        {
            return false;
        }

        boolean ans = true;

        int[] alphaIdx = new int[26];

        for(int i = 0; i < 26; i++)
        {
            alphaIdx[i] = 0;
        }

        s = s.toLowerCase();

        for(int i = 0; i < s.length(); i++)
        {
            alphaIdx[s.charAt(i) - 'a']++;
        }

        t = t.toLowerCase();

        for(int i = 0; i < t.length(); i++)
        {
            alphaIdx[s.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i++)
        {
            if(alphaIdx[i] != 0)
            {
                ans = false;
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter First String : ");
        String str1 = sc.nextLine();

        System.out.print("\nEnter Second String : ");
        String str2 = sc.nextLine();

        boolean result = isAnagram(str1, str2);

        if(result)
        {
            System.out.println("\nStr1 : " + str1 + " And " + str2 + " is Anagram.");
        }
        else
        {
            System.out.println("\nStr1 : " + str1 + " And " + str2 + " is Not Anagram.");
        }

        sc.close();
    }
}
