
import java.util.Scanner;

public class Binary_Search {

    public static int binarySearch(int numbers[], int key)
    {
        int start = 0;
        int end = numbers.length - 1;

        while(start <= end)
        {
            int mid = start + ((end - start)/2);

            if(numbers[mid] == key) // found
            {
                return mid;
            }

            if(numbers[mid] > key) // left
            {
                end = mid - 1;
            }

            if(numbers[mid] < key) // right
            {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nHow many Numbers you want to store in an Array : ");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        System.out.println("\n---: Enter Element's of \"numbers\" Array(In Sorted Manner) :---\n");

        for(int i = 0; i < size; i++)
        {
            numbers[i] = sc.nextInt();
        }

        System.out.print("\nEnter Key you want to Search from An Array : ");
        int key = sc.nextInt();

        int index = binarySearch(numbers, key);

        if(index == -1)
        {
            System.out.println("\nKey = " + key + " Not Found in \"numbers\" Array");
        }
        else
        {
            System.out.println("\nKey = " + key + " Found at Index = " + index + " of \"numbers\" Array");
        }

        sc.close();

    }
}
