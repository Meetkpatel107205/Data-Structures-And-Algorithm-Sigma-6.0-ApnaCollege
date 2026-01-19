
import java.util.Scanner;

public class Input_and_Output_for_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int marks[] = new int[100];

        System.out.println("\nLength of \"marks\" Array : " + marks.length);

        System.out.println(" ");

        // int phy;
        // phy = sc.nextInt();

        marks[0] = sc.nextInt(); // phy
        marks[1] = sc.nextInt(); // chem
        marks[2] = sc.nextInt(); // math

        System.out.println("\nphy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("math : " + marks[2]);

        // marks[2] = 99; // math (updated)
        // System.out.println("\nmath : " + marks[2]);

        // marks[2] = marks[2] + 1; // math (updated)
        // System.out.println("\nmath : " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;

        System.out.println("\nPercentage : " + percentage);

        sc.close();

    }
}
