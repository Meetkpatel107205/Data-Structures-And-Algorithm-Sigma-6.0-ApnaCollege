
import java.util.Scanner;

public class PracticeQuestion01 {

    public static void bubbleSort(int[] numbers)
    {
        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = 0; j < numbers.length - i - 1; j++)
            {
                if(numbers[j] < numbers[j + 1])
                {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
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

        System.out.print("\n---: Perform Sorting in Descending(Reverse) Order on \"numbers\" Array using Bubble Sort Algorithm :---\n\n");

        bubbleSort(numbers);

        sc.close();

    }
}

