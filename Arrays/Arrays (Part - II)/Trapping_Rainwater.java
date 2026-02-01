
import java.util.Scanner;

public class Trapping_Rainwater {

    public static int trappedRainwater(int height[]) // Time Complexity :- O(n)
    {
        // calculate left max boundary - array
        int leftMax[] = new int[height.length];

        leftMax[0] = height[0];

        for(int i = 1; i < height.length; i++)
        {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // calculate right max boundary - array
        int rightMax[] = new int[height.length];

        rightMax[height.length - 1] = height[height.length - 1];

        for(int i = height.length - 2; i >= 0; i--)
        {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int trappedWater = 0;

        // loop
        for(int i = 0; i < height.length; i++)
        {
            // waterLevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nHow many Height of Bars you want to store in an Array : ");
        int size = sc.nextInt();

        int height[] = new int[size];

        System.out.println("\n---: Enter Height's of Bars for \"height\" Array :---\n");

        for(int i = 0; i < size; i++)
        {
            height[i] = sc.nextInt();
        }

        int trappedRainwaterVal = trappedRainwater(height);

        System.out.print("\nTotal Trapped Rain Water of \"height\" Array = " + trappedRainwaterVal);

        sc.close();
    }
}
