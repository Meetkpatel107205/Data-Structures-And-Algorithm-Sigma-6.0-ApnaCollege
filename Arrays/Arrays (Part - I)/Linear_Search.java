
import java.util.Scanner;

public class Linear_Search {

    public static int linearSearch(int numbers[], int key)
    {

        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] == key)
            {
                return i;
            }
        }

        return -1;
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

        System.out.print("\nEnter Key you want to Search from An Array : ");
        int key = sc.nextInt();

        int index = linearSearch(numbers, key);

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
