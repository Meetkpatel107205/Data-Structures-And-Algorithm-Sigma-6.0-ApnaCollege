
public class Call_By_Value {

    public static void swap(int x, int y)
    {
        System.out.println("\n---: Value's Before Swapping(in Swap Function) :---\n");

        System.out.println("x(a in main) = " + x);
        System.out.println("y(b in main) = " + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("\n---: Value's After Swapping(in Swap Function) :---\n");

        System.out.println("x(a in main) = " + x);
        System.out.println("y(b in main) = " + y);
    }
    public static void main(String[] args) {
        
        int a = 5;
        int b = 10;

        System.out.println("\n---: Value's Before Calling Swap Function(in main Function) :---\n");

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        swap(a, b);

        System.out.println("\n---: Value's After Calling Swap Function(in main Function) :---\n");

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
