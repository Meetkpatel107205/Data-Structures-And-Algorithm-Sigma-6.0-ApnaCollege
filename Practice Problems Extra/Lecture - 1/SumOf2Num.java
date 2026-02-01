
import java.util.*;

public class SumOf2Num {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number - 1 : ");
        int number1 = sc.nextInt();

        System.out.print("Enter Number - 2 : ");
        int number2 = sc.nextInt(); 

        int sum = number1 + number2;

        System.err.println("\nSum : " + sum);

        sc.close();
    }
}