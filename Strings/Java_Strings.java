import java.util.Scanner;

public class Java_Strings {
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd'}; // Character Array

        String str = "abcd";

        String str2 = new String("xyz");

        // Strings are IMMUTABLE

        Scanner sc = new Scanner(System.in);
        
        String name;
        System.out.print("\nEnter Your Name : ");
        name = sc.next(); // ---> Takes only One Word as Input.

        System.out.println("Name : " + name);

        sc.nextLine(); // ---> To Completely Flush Input Stream

        String line;
        System.out.print("\nEnter Any Line : ");
        line = sc.nextLine(); // ---> Takes whole line as Input.

        System.out.println("Line : " + line);

        sc.close();
    }
}
