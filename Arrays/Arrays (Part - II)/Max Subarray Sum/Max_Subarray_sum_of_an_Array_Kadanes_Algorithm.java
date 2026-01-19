
import java.util.*;

public class Max_Subarray_sum_of_an_Array_Kadanes_Algorithm {

    // Method - 1 :-
    public static int maxSubarraySum_Using_KadanesAlgo(int numbers[]) {

        int currSum = 0;
        int maxSubarraySum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            currSum += numbers[i];

            if(currSum < 0)
            {
                currSum = 0;
            }

            // if(currSum > maxSubarraySum)
            // {
            //     maxSubarraySum = currSum;
            // }

            maxSubarraySum = Math.max(currSum, maxSubarraySum);
        }

        if(maxSubarraySum == 0)
        {
            maxSubarraySum = Integer.MIN_VALUE;

            for(int i = 0; i < numbers.length; i++)
            {
                if(numbers[i] > maxSubarraySum)
                {
                    maxSubarraySum = numbers[i];
                }
            }
        }

        return maxSubarraySum;
    }

    // Method - 2 :-
    public static int maxSubarraySumKadane(int[] numbers) {
        int currSum = numbers[0];
        int maxSum  = numbers[0];
    
        for (int i = 1; i < numbers.length; i++) {
            // Either extend the previous subarray or start fresh from current element
            currSum = Math.max(numbers[i], currSum + numbers[i]);
    
            // Update global maximum
            maxSum = Math.max(maxSum, currSum);
        }
    
        return maxSum;
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

        int maxSubarraySumVal = maxSubarraySum_Using_KadanesAlgo(numbers);

        System.out.print("\nMax Subarray Sum  of \"numbers\" Array = " + maxSubarraySumVal);

        sc.close();

    }
}
