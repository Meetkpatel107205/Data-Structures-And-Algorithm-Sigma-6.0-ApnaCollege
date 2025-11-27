
public class Product {

    public static int multiply(int x, int y)
    {
        return (x * y);
    }
    public static void main(String[] args) {

        int a = 5;
        int b = 2;

        int prod1 = multiply(a, b);

        System.out.println("Product of a(" + a + ") and b(" + b + ") (" + a + " * " + b + ")" + " : " + prod1);

        int prod2 = multiply(10, 20);

        System.out.println("Product of 10 and 20 (10 * 20) : " + prod2);
    }
}