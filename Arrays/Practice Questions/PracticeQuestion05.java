import java.util.*;

public class PracticeQuestion05 {

    // Question 5: 3Sum (Brute Force)
    public static List<List<Integer>> threeSum(int nums[]) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {

                    if (nums[i] + nums[j] + nums[k] == 0) {

                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);

                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }

        // Remove duplicate triplets
        result = new ArrayList<>(
                new LinkedHashSet<List<Integer>>(result)
        );

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nHow many Numbers you want to store in an Array : ");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        System.out.println("\n---: Enter Element's of \"numbers\" Array :---\n");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        List<List<Integer>> ans = threeSum(numbers);

        System.out.println("\nTriplets whose sum is zero:");

        if (ans.isEmpty()) {
            System.out.println("No triplets found.");
        } else {
            for (List<Integer> triplet : ans) {
                System.out.println(triplet);
            }
        }

        sc.close();
    }
}
