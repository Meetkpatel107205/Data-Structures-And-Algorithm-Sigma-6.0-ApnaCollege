
public class TypePromotionInExpression {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println(a);
        System.out.println(b);
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(b-a);

        // char c = a - b; ---> Error
        // System.out.println(c);

        short d = 5;
        byte e = 25;
        char f = 'c';
        // byte bt = a + b + c; ---> Error, becuase result value of expression is convertec into int due to type promotion in expression.
        byte bt = (byte) (d + e + f);
        System.out.println(bt);
    }    
}
