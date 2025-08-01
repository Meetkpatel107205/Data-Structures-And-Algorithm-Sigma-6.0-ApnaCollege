
import java.util.*;
public class PracticeQuestion03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Price of Item - 1 : ");
        float i1 = sc.nextInt();

        System.out.print("Enter Price of Item - 2 : ");
        float i2 = sc.nextInt();

        System.out.print("Enter Price of Item - 3 : ");
        float i3 = sc.nextInt();

        float gst = 18;

        float sum = i1 + (i1*(gst/100)) + i2 + (i2*(gst/100)) + i3 + (i3*(gst/100));

        System.out.println("\n---: Bill :---");
        System.out.println("\nItem - 1    : " + i1);
        System.out.println("Item - 2    : " + i2);
        System.out.println("Item - 3    : " + i3);
        System.out.println("\nTotal : " + sum);
    }
}
