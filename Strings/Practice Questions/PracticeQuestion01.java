
import java.util.Scanner;

public class PracticeQuestion01 {

    public static int countLowercaseVowels(String s)
    {
        int count = 0;

        for(int i = 0; i < s.length(); i++)
        {
            char character = s.charAt(i);
            int charASCII = s.charAt(i);

            if(charASCII >= 97 && charASCII <= 122)
            {
                if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')
                {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Any String : ");
        String str = sc.nextLine();

        int result = countLowercaseVowels(str);

        System.out.println("\nNumber of Lowercase Vowels in given string : " + result);

        sc.close();
    }
}
