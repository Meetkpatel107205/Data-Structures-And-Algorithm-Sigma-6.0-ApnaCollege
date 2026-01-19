
import java.util.Scanner;

public class LInear_Search_2 {

    public static int linearSearch(String menu[], String key)
    {

        for(int i = 0; i < menu.length; i++)
        {
            if(menu[i].equals(key))
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nHow many Menu Items you want to store in an Array : ");
        int size = sc.nextInt();

        sc.nextLine();

        String menu[] = new String[size];

        System.out.println("\n---: Enter Element's of \"menu\" Array :---\n");

        for(int i = 0; i < size; i++)
        {
            menu[i] = sc.nextLine();
        }

        System.out.print("\nEnter Key you want to Search from An Array : ");
        String key = sc.nextLine();

        int index = linearSearch(menu, key);

        if(index == -1)
        {
            System.out.println("\nKey = " + key + " Not Found in \"menu\" Array");
        }
        else
        {
            System.out.println("\nKey = " + key + " Found at Index = " + index + " of \"menu\" Array");
        }

        sc.close();

    }
}
