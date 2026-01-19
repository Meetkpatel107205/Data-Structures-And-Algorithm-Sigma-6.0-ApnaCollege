
public class Passing_Array_as_an_Argument {

    public static void update(int marks[], int nonChangable) {

        nonChangable = 10;

        for(int i = 0; i < marks.length; i++)
        {
            marks[i] = marks[i] + 1;
        }

    }

    public static void main(String[] args) {

        int marks[] = {97, 98, 99};
        int nonChangable = 5;

        System.out.println("\nnonChangable variable value Before executing \"update\" Function : " + nonChangable);

        System.out.println("\n---: Printing Marks Before Updating :---\n");

        for(int i = 0; i < marks.length; i++)
        {
            System.out.print(marks[i] + " ");
        }

        update(marks, nonChangable);

        System.out.println("\n\nnonChangable variable value After executing \"update\" Function : " + nonChangable);

        System.out.println("\n---: Printing Marks After Updating :---\n");

        for(int i = 0; i < marks.length; i++)
        {
            System.out.print(marks[i] + " ");
        }

    }
}
