public class Method_Scope {

    public static void print5()
    {
        int s = 45; // <--- Method Scope
    }

    public static void main(String[] args) {
        // System.out.println(s); <--- Error
    }
}