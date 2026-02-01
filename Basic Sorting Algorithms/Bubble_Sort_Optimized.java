
import java.util.Scanner;

public class Bubble_Sort_Optimized {

    public static void bubbleSortOptimized(int[] numbers)
    {
        int swapCount = 0;
        
        for(int i = 0; i < numbers.length - 1; i++)
        {

            for(int j = 0; j < numbers.length - 1 - i; j++)
            {
                if(numbers[j] > numbers[j + 1])
                {
                    // swap
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;

                    swapCount++;
                }
            }

            if(swapCount == 0)
            {
                System.out.println("Array \"numbers\" is Already Sorted\n");
                break;
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

        System.out.print("\n---: Perform Sorting on \"numbers\" Array using Bubble Sort(Optimized) Algorithm :---\n\n");

        bubbleSortOptimized(numbers);

        sc.close();

    }
}
