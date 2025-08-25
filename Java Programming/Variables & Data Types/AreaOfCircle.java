
import java.util.*;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius of Circle : ");
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;

        System.out.println("Area of Circle is : " + area);

        sc.close();
    }
}
