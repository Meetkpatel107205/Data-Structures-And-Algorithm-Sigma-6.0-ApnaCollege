
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age;

        System.out.print("\nEnter Your Age : ");
        age = sc.nextInt();

        if(age >= 18)
        {
            System.out.println("\nAdult : Drive, Vote");
        }
        else
        {
            System.out.println("\nNot Adult");
        }

        sc.close();
    }
}
