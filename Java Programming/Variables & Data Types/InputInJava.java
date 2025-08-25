
import java.util.*;
public class InputInJava
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        System.out.println(input);

        sc.nextLine();

        System.out.println(" ");

        String name = sc.nextLine();
        System.out.println(name);

        System.out.println(" ");

        int number = sc.nextInt();
        System.out.println(number);

        System.out.println(" ");

        float price = sc.nextFloat();
        System.out.println(price);

        System.out.println(" ");

        double d = sc.nextDouble();
        System.out.println(d);

        System.out.println(" ");

        boolean b = sc.nextBoolean();
        System.out.println(b);

        System.out.println(" ");

        Short s = sc.nextShort();
        System.out.println(s);

        System.out.println(" ");

        long l = sc.nextLong();
        System.out.println(l);

        sc.close();
    }    
}
