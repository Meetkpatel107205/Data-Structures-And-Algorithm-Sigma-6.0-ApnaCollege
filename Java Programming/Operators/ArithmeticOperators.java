
public class ArithmeticOperators {
    public static void main(String[] args) {

        int A = 10;
        int B = 5;

        System.out.println("A = " + A);
        System.out.println("B = " + B);

        System.out.println("\n---: Binary Operators :---\n");
        System.out.println("[1.] Add              : A + B = " + (A + B));
        System.out.println("[2.] Subtract         : A - B = " + (A - B));
        System.out.println("[3.] Multiplication   : A * B = " + (A * B));
        System.out.println("[4.] Division         : A / B = " + (A / B));
        System.out.println("[5.] Modulo           : A % B = " + (A % B));

        int C = 10;
        int D = 10;

        System.out.println("\n---: Unary Operators :---\n");

        System.out.println("[A.] Increment :-");

        System.out.println("\nC (Before ++C) = " + C);
        int PreInc = ++C;
        System.out.println("[1.] Pre Increment (PreInc = ++C) : PreInc = " + PreInc);
        System.out.println("C (After ++C) = " + C);

        System.out.println("\nD (Before D++) = " + D);
        int PostInc = D++;
        System.out.println("[2.] Post Increment (PostInc = D++) : PostInc = " + PostInc);
        System.out.println("D (After D++) = " + D);

        int E = 10;
        int F = 10;
        
        System.out.println("\n[B.] Decrement :-");

        System.out.println("\nE (Before --E) = " + E);
        int PreDec = --E;
        System.out.println("[1.] Pre Increment (PreDec = --E) : PreDec = " + PreDec);
        System.out.println("C (After --E) = " + E);

        System.out.println("\nF (Before F--) = " + F);
        int PostDec = F--;
        System.out.println("[2.] Post Increment (PostDec = F--) : PostDec = " + PostDec);
        System.out.println("F (After F--) = " + F);
    }   
}
