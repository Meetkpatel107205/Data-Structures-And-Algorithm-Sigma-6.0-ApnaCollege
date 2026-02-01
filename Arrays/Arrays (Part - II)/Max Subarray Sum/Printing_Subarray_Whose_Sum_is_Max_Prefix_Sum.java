
import java.util.*;

public class Printing_Subarray_Whose_Sum_is_Max_Prefix_Sum {

    public static void maxSubarraySum_Using_PrefixSum(int numbers[]) {

        int currSum = 0;
        int maxSubarraySum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        int maxStartIdx = 0;
        int maxEndIdx = 0;

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
                    maxStartIdx = i;
                    maxEndIdx = j;
                    maxSubarraySum = currSum;
                }

            }
        }
        
        System.out.print("[ ");

        for(int i = maxStartIdx; i <= maxEndIdx; i++)
        {
            if(i != maxEndIdx)
            {
                System.out.print(numbers[i] + ", ");
            }
            else
            {
                System.out.print(numbers[i] + " ]");
            }
        }
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

        maxSubarraySum_Using_PrefixSum(numbers);

        sc.close();

    }
}
