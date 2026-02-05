import java.util.Scanner;

public class String_Concatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Your First Name : ");
        String firstName = sc.next();

        System.out.print("Enter Your Last Name : ");
        String lastName = sc.next();

        String fullName = firstName + " " + lastName; // <--- String Concatenation

        System.out.println("\n---: Printing \"fullName\" After Performing \"Concatenation\" Between \"firstName\" And \"lastName\" : " + fullName);

        sc.close();
    }
}
