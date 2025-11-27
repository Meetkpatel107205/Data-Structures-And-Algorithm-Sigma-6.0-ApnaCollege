
public class Swap_of_values
{
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        System.out.println("\n---: Value's Before Swapping :---\n");

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("\n---: Value's After Swapping :---\n");

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}