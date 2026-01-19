
import java.util.Scanner;

public class Reverse_an_Array {

    public static void reverse(int numbers[])
    {
        int first = 0, last = numbers.length - 1;

        while(first < last)
        {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
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

        reverse(numbers);

        System.out.print("\n---: Reverse of \"numbers\" Array :---\n\n");

        System.out.print("[ ");

        for(int i = 0; i < size; i++)
        {
            if(i == (size - 1))
            {
                System.out.print(numbers[i]);
            }
            else
            {
                System.out.print(numbers[i] + ", ");
            }
        }

        System.out.print(" ]");

        sc.close();

    }
}

