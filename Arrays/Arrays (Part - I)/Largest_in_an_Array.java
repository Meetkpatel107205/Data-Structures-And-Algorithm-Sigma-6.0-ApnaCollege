
import java.util.*;

public class Largest_in_an_Array {

    public static int getLargest(int numbers[])
    {

        int largest = Integer.MIN_VALUE; // -infinity

        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] > largest)
            {
                largest = numbers[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nHow many Numbers you want to store in an Array : ");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        System.out.println("\n---: Enter Element's of \"numbers\" Array :---\n");

        for(int i = 0; i < size; i++)
        {
            numbers[i] = sc.nextInt();
        }

        int largestVal = getLargest(numbers);

        System.out.println("\nLargest Value in \"numbers\" Array  = " + largestVal);

        sc.close();

    }
}
