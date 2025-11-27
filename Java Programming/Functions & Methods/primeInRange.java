public class primeInRange {

    public static boolean isPrimeCheck(int n)
    {
        // corner cases
        // 2

        if(n == 2)
        {
            return true;
        }

        // for(int i = 2; i <= Math.sqrt(n); i++)
        for(int i = 2; i * i <= n; i++)
        {
            if(n % i == 0) // completely dividing
            {
                return false;
            }
        }
        
        return true;
    }

    public static void printPrimeInRange(int n)
    {
        for(int i = 2; i <= n; i++)
        {
            if(isPrimeCheck(i))
            {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        printPrimeInRange(20); // 2 to 20
        printPrimeInRange(100);
    }
}
