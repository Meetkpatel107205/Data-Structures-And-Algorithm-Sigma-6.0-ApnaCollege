
import java.util.*;

public class Min_Subarray_sum_of_an_Array_Brute_force {

    public static int minSubarraySum(int numbers[]) {

        int minSubarraySum = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i; j < numbers.length; j++) {

                int subarraySum = 0;

                for (int k = i; k <= j; k++) {

                    subarraySum += numbers[k];
                }

                if(subarraySum < minSubarraySum)
                {
                    minSubarraySum = subarraySum;
                }

            }
        }
        return minSubarraySum;
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

        int minSubarraySumVal = minSubarraySum(numbers);

        System.out.print("\nMin Subarray Sum  of \"numbers\" Array = " + minSubarraySumVal);

        sc.close();

    }
}
