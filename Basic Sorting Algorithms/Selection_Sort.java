
import java.util.Scanner;

public class Selection_Sort {

    public static void selectionSort(int[] numbers)
    {
        for(int i = 0; i < numbers.length; i++)
        {
            int minPos = i;
            
            for(int j = i + 1; j < numbers.length; j++)
            {
                if(numbers[minPos] > numbers[j])
                {
                    minPos = j;
                }
            }

            // swap
            int temp = numbers[minPos];
            numbers[minPos] = numbers[i];
            numbers[i] = temp;
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

        System.out.print("\n---: Perform Sorting on \"numbers\" Array using Selection Sort Algorithm :---\n\n");

        selectionSort(numbers);

        sc.close();

    }
}
