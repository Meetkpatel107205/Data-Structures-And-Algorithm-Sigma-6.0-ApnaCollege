
import java.util.*;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // float a = 25.12f;
        // int b = a;

        float a = 25.12f;
        int b = (int) a;
        System.out.println(b);

        float marks = 99.999f;
        int marks2 = (int) marks;
        System.out.println(marks2); // ---> Important Data that we lost after casting into int(lost of floating point values).
    }    
}
