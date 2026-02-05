
import java.util.Scanner;

public class String_Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Full Name : ");
        String fullName = sc.nextLine();

        System.out.println("\nFull Name : " + fullName);
        System.out.println("Full Name Length : " + fullName.length());

        sc.close();
    }
}
