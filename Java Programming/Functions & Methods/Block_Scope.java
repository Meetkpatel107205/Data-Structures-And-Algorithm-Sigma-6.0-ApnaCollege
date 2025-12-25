public class Block_Scope {
    public static void main(String[] args) {

        {
            int s = 45; // <--- Block Scope
        }

        // System.out.println(s); <--- Error

        for(int i = 1, j = 0, k = 4; i <= 5; i++)
        {
            // Block Scope: i, j, k
        }

        int i = 4;
        System.out.println(i); // 4
    }
}