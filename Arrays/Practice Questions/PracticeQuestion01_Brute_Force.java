
import java.util.Scanner;

public class PracticeQuestion01_Brute_Force {

    public static boolean containsDuplicate(int numbers[])
    {
        for(int i = 0; i < numbers.length - 1; i++)
        {
            for(int j = i + 1; j < numbers.length; j++)
            {
                if(numbers[i] == numbers[j])
                {
                    return true;
                }
            }
        }

        return false;
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

        boolean isContainsDuplicate = containsDuplicate(numbers);

        if(isContainsDuplicate)
        {
            System.out.println("\n\"numbers\" Array Contains Some Duplicate Elements");
        }
        else
        {
            System.out.println("\n\"numbers\" Array Not Contains Any Duplicate Elements");
        }

        sc.close();

    }
}
