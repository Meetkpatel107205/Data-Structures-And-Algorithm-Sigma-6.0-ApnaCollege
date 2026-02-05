
import java.util.Scanner;

public class Largest_String_Lexicographically_2 {

    public static String largestStringLexicographically(String[] arr)
    {
        String largest = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            int compareResult = largest.compareTo(arr[i]);

            if(compareResult < 0)
            {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nHow Many Value's(Fruits) You Want to Enter : ");
        int size = sc.nextInt();

        String[] fruits = new String[size];

        System.out.println("\n---: Enter Fruit's Value(Array Elements) :---\n");

        for(int i = 0; i < size; i++)
        {
            fruits[i] = sc.next();
        }

        String ans = largestStringLexicographically(fruits);

        System.out.println("\nLargest String Value Lexicographically from \"fruits\" Array : " + ans);

        sc.close();
    }
}
