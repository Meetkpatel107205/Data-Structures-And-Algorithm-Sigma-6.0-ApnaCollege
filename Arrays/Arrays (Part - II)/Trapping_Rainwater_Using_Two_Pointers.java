
import java.util.Scanner;

public class Trapping_Rainwater_Using_Two_Pointers {

    public static int trappedRainwater(int height[]) // Time Complexity :- O(n)
    {
        int lMax = height[0];
        int rMax = height[height.length - 1];
        int left = 1;
        int right = height.length - 2;
        int waterLevel = 0;
        int trappedWater = 0;

        // loop
        while(left <= right)
        {
            if(lMax < rMax)
            {
                waterLevel = Math.max(0, lMax - height[left]);

                if(height[left] > lMax)
                {
                    lMax = height[left];
                }

                left++;
            }
            else
            {
                waterLevel = Math.max(0, rMax - height[right]);

                if(height[right] > rMax)
                {
                    rMax = height[right];
                }

                right--;
            }

            trappedWater += waterLevel;
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
