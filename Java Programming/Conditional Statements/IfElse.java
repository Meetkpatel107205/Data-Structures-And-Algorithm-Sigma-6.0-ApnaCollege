
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
        else if(age > 13 && age < 18)
        {
            System.out.println("\nTeenager");
        }
        else
        {
            System.out.println("\nNot Adult");
        }
    }
}
