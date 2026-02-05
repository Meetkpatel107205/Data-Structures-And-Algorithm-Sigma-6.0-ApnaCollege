
import java.util.Scanner;

public class Shortest_Path_to_Reach_Destination {

    public static double getShortestPath(String str)
    {
        int x_coordinate = 0;
        int y_coordinate = 0;

        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == 'e')
            {
                x_coordinate++;
            }

            if(str.charAt(i) == 'w')
            {
                x_coordinate--;
            }

            if(str.charAt(i) == 'n')
            {
                y_coordinate++;
            }

            if(str.charAt(i) == 's')
            {
                y_coordinate--;
            }
        }

        double ans = Math.sqrt((Math.pow(x_coordinate, 2) + Math.pow(y_coordinate, 2))); // <--- Shortest Path is Basically Displacement Between Final Point and Origin(0, 0). This is Formula to Calculate Displacement.

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Direction's to Reach the Final Destination in Form of a String : ");
        String dString = sc.next();

        double shortestDistance = getShortestPath(dString);

        System.out.println("\nShortest Path(Distance) to Reach Destination using given Direction String \"dString\" is : " + shortestDistance);

        sc.close();
    }
}
