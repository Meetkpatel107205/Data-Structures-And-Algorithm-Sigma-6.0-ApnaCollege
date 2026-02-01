
import java.util.Scanner;

public class PracticeQuestion02 {

    // Method - 1 :-

    public static int binarySearchInRotatedSortedArray(int[] arr, int t)
    {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while(low <= high)
        {
            int mid = low + ((high - low)/2);

            if(arr[mid] == t)
            {
                ans = mid;
                break;
            }
            
            if(arr[low] <= arr[mid]) // left sorted
            {
                if(arr[low] <= t && t <= arr[mid])
                {
                    high = mid - 1;
                }
                else
                {
                    low = mid + 1;
                }
            }
            else // right sorted
            {
                if(arr[mid] <= t && t <= arr[high])
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }
            }
        }

        return ans;
    }

    // Method - 2 :-

    // public int search(int[] nums, int target) {
    //     int min = minSearch(nums);
    
    //     if (nums[min] <= target && target <= nums[nums.length - 1]) {
    //         return search(nums, min, nums.length - 1, target);
    //     } else {
    //         return search(nums, 0, min, target);
    //     }
    // }

    // public int search(int[] nums, int left, int right, int target) {
    //     int l = left;
    //     int r = right;
    
    //     while (l <= r) {
    //         int mid = l + (r - l) / 2;
    
    //         if (nums[mid] == target) {
    //             return mid;
    //         } else if (nums[mid] > target) {
    //             r = mid - 1;
    //         } else {
    //             l = mid + 1;
    //         }
    //     }
    //     return -1;
    // }

    // Method - 3 :-

    // public int minSearch(int[] nums) {
    //     int left = 0;
    //     int right = nums.length - 1;
    
    //     while (left < right) {
    //         int mid = left + (right - left) / 2;
    
    //         if (mid > 0 && nums[mid - 1] > nums[mid]) {
    //             return mid;
    //         } else if (nums[left] <= nums[mid] && nums[mid] > nums[right]) {
    //             left = mid + 1;
    //         } else {
    //             right = mid - 1;
    //         }
    //     }
    //     return left;
    // }

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

        System.out.print("\nEnter Target Element : ");
        int target = sc.nextInt();

        int targetIdx = binarySearchInRotatedSortedArray(numbers, target);

        if(targetIdx != -1)
        {
            System.out.println("\nTarget Element " + target + " is Present in \"numbers\" Array at Index " + targetIdx);
        }
        else
        {
            System.out.println("\nTarget Element " + target + " is Not Present in \"numbers\" Array");
        }

        sc.close();

    }
}
