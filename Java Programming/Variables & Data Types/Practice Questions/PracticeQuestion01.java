
import java.util.*;

public class PracticeQuestion01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number - 1 : ");
        int a = sc.nextInt();

        System.out.print("Enter Number - 2 : ");
        int b = sc.nextInt();

        System.out.print("Enter Number - 3 : ");
        int c = sc.nextInt();

        int avg = (a + b + c)/3;

        System.out.println("Average : " + avg);
    }    
}
