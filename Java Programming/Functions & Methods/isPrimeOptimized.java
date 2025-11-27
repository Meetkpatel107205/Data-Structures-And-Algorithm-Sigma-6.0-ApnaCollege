public class isPrimeOptimized {
    
    // only for n >= 2
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
    public static void main(String[] args) {
        System.out.println(isPrimeCheck(12));
        System.out.println(isPrimeCheck(3));
        System.out.println(isPrimeCheck(2));
    }
}
