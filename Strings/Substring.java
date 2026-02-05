
import java.util.Scanner;

public class Substring {

    public static String substring(String str, int si, int ei)
    {
        String substr = "";

        for(int i = si; i < ei; i++)
        {
            substr += str.charAt(i);
        }

        return substr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Any String : ");
        String str = sc.nextLine();

        // substring
        System.out.print("Enter Starting Index Value of Sub-String : ");
        int start = sc.nextInt();

        System.out.print("Enter Ending Index Value of Sub-String : ");
        int end = sc.nextInt();

        String subStr1 = substring(str, start, end);

        // Java also has Pre-defined Sub-String Function : str.substring(start, end) -> Sub-String ranges in [start, end).
        String subStr2 = str.substring(start, end);

        System.out.println("\n---: Using \"Manual Written\" Sub-String Function :---");
        System.out.println("\nPrinting Sub-String Starting from Index \"" + start + "\" to Ending Index(Exclusive) \"" + end + "\" in Original String \"str\" : " + subStr1);
        
        System.out.println("\n---: Using \"Pre-Defined\" Sub-String Function :---");
        System.out.println("\nPrinting Sub-String Starting from Index \"" + start + "\" to Ending Index(Exclusive) \"" + end + "\" in Original String \"str\" : " + subStr2);

        sc.close();
    }
}
