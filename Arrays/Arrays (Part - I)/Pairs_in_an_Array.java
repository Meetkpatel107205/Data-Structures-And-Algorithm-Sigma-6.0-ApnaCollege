
import java.util.Scanner;

public class Pairs_in_an_Array {

    public static void printPairs(int numbers[])
    {
        int totalPairs = 0;

        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = i + 1; j < numbers.length; j++)
            {
                System.out.print("(" + numbers[i] + ", " + numbers[j] + ")");

                totalPairs++;

                if (!(i == numbers.length - 2 && j == numbers.length - 1))
                {
                    System.out.print(", ");
                }
            }

            System.out.println(" ");
        }

        System.out.println("Total Number of Pairs in \"numbers\" Array : " + totalPairs);
        // Mathematical Formula for count totalPairs for n elements = (n*(n - 1))/2
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

        System.out.print("\n---: All Pairs of \"numbers\" Array :---\n\n");

        printPairs(numbers);

        sc.close();

    }
}