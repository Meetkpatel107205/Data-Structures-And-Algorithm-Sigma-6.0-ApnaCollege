
public class Creating_an_Array {
    public static void main(String[] args) {

        // creating an array

        int marks[] = new int[50];

        marks[0] = 90;
        marks[1] = 95;
        marks[2] = 92;
        marks[3] = 93;
        marks[4] = 99;

        System.out.print("\nmarks Array: [ ");

        for(int i = 0; i < 5; i++)
        {
            if(i == 4)
            {
                System.out.print(marks[i]);
            }
            else
            {
                System.out.print(marks[i] + ", ");
            }
        }

        System.out.print(" ]");

        System.out.println("\n");

        int numbers[] = {1, 2, 3};

        System.out.print("numbers Array: [ ");

        for(int i = 0; i < numbers.length; i++)
        {
            if(i == (numbers.length - 1))
            {
                System.out.print(numbers[i]);
            }
            else
            {
                System.out.print(numbers[i] + ", ");
            }
        }

        System.out.print(" ]");
    }
}
