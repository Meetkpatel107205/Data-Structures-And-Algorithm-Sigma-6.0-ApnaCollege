
import java.util.Scanner;

public class Insertion_Sort {

    public static void insertionSort(int[] numbers)
    {
        for(int i = 1; i < numbers.length; i++)
        {
            int curr = numbers[i];
            int prev = i - 1;

            // finding out the correct pos to insert
            while(prev >= 0 && numbers[prev] > curr)
            {
                numbers[prev + 1] = numbers[prev];
                prev--;
            }

            // insertion
            numbers[prev + 1] = curr;
        }

        System.out.print("[ ");

        for(int i = 0; i < numbers.length; i++)
        {
            if(i != numbers.length - 1)
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

        System.out.print("\n---: Perform Sorting on \"numbers\" Array using Insertion Sort Algorithm :---\n\n");

        insertionSort(numbers);

        sc.close();

    }
}
