
import java.util.*;

public class Max_Subarray_sum_of_an_Array_Prefix_Sum {

    public static int maxSubarraySum_Using_PrefixSum(int numbers[]) {

        int currSum = 0;
        int maxSubarraySum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];

        for(int i = 1; i < numbers.length; i++)
        {
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {

            int start = i;

            for (int j = i; j < numbers.length; j++) {

                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if(currSum > maxSubarraySum)
                {
                    maxSubarraySum = currSum;
                }

            }
        }

        return maxSubarraySum;
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

        int maxSubarraySumVal = maxSubarraySum_Using_PrefixSum(numbers);

        System.out.print("\nMax Subarray Sum  of \"numbers\" Array = " + maxSubarraySumVal);

        sc.close();

    }
}
