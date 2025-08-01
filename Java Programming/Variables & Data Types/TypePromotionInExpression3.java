
public class TypePromotionInExpression3 {
    public static void main(String[] args) {
        byte b = 5;
        // byte a = b * 2; ---> Error, becuase of type promotion in expression to int 
        // System.out.println(a);
        byte a = (byte) (b * 2);
        System.out.println(a);
    }
}
