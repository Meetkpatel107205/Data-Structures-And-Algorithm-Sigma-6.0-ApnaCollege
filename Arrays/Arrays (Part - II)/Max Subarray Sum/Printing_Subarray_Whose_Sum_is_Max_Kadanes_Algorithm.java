
import java.util.*;

public class Printing_Subarray_Whose_Sum_is_Max_Kadanes_Algorithm {

    public static void maxSubarraySumKadane(int[] numbers) {

        int currSum = numbers[0];
        int maxSum  = numbers[0];

        int start = 0;
        int maxStart = 0, maxEnd = 0;

        for (int i = 1; i < numbers.length; i++) {

            // Decide whether to extend or start new
            if (numbers[i] > currSum + numbers[i]) {
                currSum = numbers[i];
                start = i;
            } else {
                currSum += numbers[i];
            }

            // Update global maximum and indices
            if (currSum > maxSum) {
                maxSum = currSum;
                maxStart = start;
                maxEnd = i;
            }
        }

        System.out.print("[ ");
        for (int i = maxStart; i <= maxEnd; i++) {
            if (i != maxEnd)
                System.out.print(numbers[i] + ", ");
            else
                System.out.print(numbers[i] + " ]");
        }

        System.out.println("\n\nMax Sum = " + maxSum);
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

        System.out.print("\nPrinting Subarray who Produce Max Subarray Sum of \"numbers\" Array : ");

        maxSubarraySumKadane(numbers);

        sc.close();

    }
}
