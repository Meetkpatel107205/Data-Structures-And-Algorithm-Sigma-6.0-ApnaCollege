
public class PracticeQuestion04 {
    public static void main(String[] args) {
        
        // -----------------------------
        //  a) Math.min(x, y)
        // -----------------------------
        // Returns the smaller number between two values.
        int a = 10;
        int b = 20;
        System.out.println("Math.min(10, 20) = " + Math.min(a, b));
        // Output: 10
        // Reason: 10 is smaller than 20.


        // -----------------------------
        //  b) Math.max(x, y)
        // -----------------------------
        // Returns the larger number between two values.
        System.out.println("Math.max(10, 20) = " + Math.max(a, b));
        // Output: 20
        // Reason: 20 is greater than 10.


        // -----------------------------
        //  c) Math.sqrt(x)
        // -----------------------------
        // Returns the square root of a number.
        int num1 = 49;
        System.out.println("Math.sqrt(49) = " + Math.sqrt(num1));
        // Output: 7.0
        // Reason: sqrt(49) = 7.


        // -----------------------------
        //  d) Math.pow(base, exponent)
        // -----------------------------
        // Returns base raised to power exponent (base^exponent).
        // Example: 2^5 = 32
        System.out.println("Math.pow(2, 5) = " + Math.pow(2, 5));
        // Output: 32.0
        // Reason: 2 * 2 * 2 * 2 * 2 = 32.


        // -----------------------------
        //  e) Math.avg(x, y)  << DOES NOT EXIST IN JAVA
        // -----------------------------
        // Java does NOT have Math.avg().
        // But we can calculate average using:
        // Average = (x + y) / 2.0
        int x = 40;
        int y = 60;
        double avg = (x + y) / 2.0;
        System.out.println("Average of 40 and 60 = " + avg);
        // Output: 50.0


        // -----------------------------
        //  f) Math.abs(x)
        // -----------------------------
        // Returns the absolute value (positive value) of a number.
        // Converts negative numbers to positive.
        int negative = -25;
        System.out.println("Math.abs(-25) = " + Math.abs(negative));
        // Output: 25
        // Reason: Absolute value of -25 is 25.


        // BONUS: More Math.abs examples
        System.out.println("Math.abs(15) = " + Math.abs(15));     // 15
        System.out.println("Math.abs(-99) = " + Math.abs(-99));   // 99
    }
}