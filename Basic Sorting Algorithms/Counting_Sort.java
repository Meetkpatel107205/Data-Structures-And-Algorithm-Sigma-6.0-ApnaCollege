
import java.util.Scanner;

public class Counting_Sort {

    public static void countingSort(int[] numbers)
    {
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++)
        {
            largest = Math.max(largest, numbers[i]);
        }

        int[] countArray = new int[largest + 1];

        for(int i = 0;i < numbers.length; i++)
        {
            countArray[numbers[i]]++;
        }

        int j = 0;

        for(int i = 0; i < countArray.length; i++)
        {
            while(countArray[i] > 0)
            {
                numbers[j] = i;
                j++;
                countArray[i]--;
            }
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

        System.out.print("\n---: Perform Sorting on \"numbers\" Array using Counting Sort Algorithm :---\n\n");

        countingSort(numbers);

        sc.close();

    }
}
