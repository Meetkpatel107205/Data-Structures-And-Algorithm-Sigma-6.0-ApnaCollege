
import java.util.Scanner;

public class Subarray_of_an_Array {

    public static void printSubarrays(int numbers[]) {

        int totalSubarray = 0;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i; j < numbers.length; j++) {

                System.out.print("[");

                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k]);
                    if (k < j) {
                        System.out.print(", ");
                    }
                }

                totalSubarray++;

                System.out.println("]");
            }
        }

        System.out.println("\nTotal Subarrays of \"numbers\" Array : " + totalSubarray);
        // Mathematical Formula for count totalSubarrays for n elements = (n*(n + 1))/2
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

        System.out.print("\n---: Subarrays of \"numbers\" Array :---\n\n");

        printSubarrays(numbers);

        sc.close();

    }
}
