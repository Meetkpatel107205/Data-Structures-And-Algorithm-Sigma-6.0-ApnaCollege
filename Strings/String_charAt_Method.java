
import java.util.Scanner;

public class String_charAt_Method {

    public static void printLetters(String str)
    {
        for(int i = 0; i < str.length(); i++)
        {
            System.out.print(str.charAt(i) + ", ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Any String : ");
        String str = sc.nextLine();

        System.out.println("\n---: Printing Letters of String \"str\" using \"charAt\" Method :---\n");

        printLetters(str);

        sc.close();
    }
}
