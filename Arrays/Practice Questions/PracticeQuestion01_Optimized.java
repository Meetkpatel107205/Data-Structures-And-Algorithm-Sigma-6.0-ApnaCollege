
import java.util.HashSet;
import java.util.Scanner;

public class PracticeQuestion01_Optimized {

    public static boolean containsDuplicate(int numbers[])
    {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < numbers.length; i++)
        {
            if(set.contains(numbers[i]))
            {
                return true;
            }
            else
            {
                set.add(numbers[i]);
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
