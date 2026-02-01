
import java.util.Scanner;

public class PracticeQuestion04 {

    // Method - 1(Prefix arrays) :-

    public static int trappedRainWater(int[] arr)
    {
        int[] leftPrefixSum = new int[arr.length];
        int[] rightPrefixSum = new int[arr.length];

        leftPrefixSum[0] = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            leftPrefixSum[i] = Math.max(leftPrefixSum[i - 1], arr[i]);
        }

        rightPrefixSum[arr.length - 1] = arr[arr.length - 1];

        for(int i = arr.length - 2; i >= 0; i--)
        {
            rightPrefixSum[i] = Math.max(rightPrefixSum[i + 1], arr[i]);
        }

        int barWidth = 1;
        int totalTrappedRainWater = 0;

        for(int i = 0; i < arr.length; i++)
        {
            totalTrappedRainWater += ((Math.min(leftPrefixSum[i], rightPrefixSum[i]) - arr[i]) * barWidth);
        }

        return totalTrappedRainWater;
    }

    // Method - 2(Two Pointers) :-

    // public int trap(int[] height) {
    //     int n = height.length;
    //     int res = 0, l = 0, r = n - 1;
    
    //     int lMax = height[l];
    //     int rMax = height[r];
    
    //     while (l < r) {
    //         if (lMax < rMax) {
    //             l++;
    //             lMax = Math.max(lMax, height[l]);
    //             res += lMax - height[l];
    //         } else {
    //             r--;
    //             rMax = Math.max(rMax, height[r]);
    //             res += rMax - height[r];
    //         }
    //     }
    //     return res;
    // }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nHow many Bar's Height you want to store in an Array : ");
        int size = sc.nextInt();

        int heights[] = new int[size];

        System.out.println("\n---: Enter Bar's Height to store in an Array :---\n");

        for(int i = 0; i < size; i++)
        {
            heights[i] = sc.nextInt();
        }

        int ans = trappedRainWater(heights);

        System.out.println("\nTrapped Rain Water : " + ans);

        sc.close();

    }
}
