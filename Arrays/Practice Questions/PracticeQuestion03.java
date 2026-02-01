
import java.util.Scanner;

public class PracticeQuestion03 {

    // Method - 1 :-

    public static int maxProfitOfStock(int[] arr)
    {
        int maxProfitPrice = 0;
        int buyPrice = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < buyPrice)
            {
                buyPrice = arr[i];
            }
            else
            {
                maxProfitPrice = Math.max(maxProfitPrice, arr[i] - buyPrice);
            }
        }

        return maxProfitPrice;
    }

    // Method - 2 :-

    // public int maxProfit(int[] prices) {
    //     int buy = prices[0];
    //     int profit = 0;
    
    //     for (int i = 1; i < prices.length; i++) {
    //         if (buy < prices[i]) {
    //             profit = Math.max(prices[i] - buy, profit);
    //         } else {
    //             buy = prices[i];
    //         }
    //     }
    //     return profit;
    // }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nHow many Stock Prices you want to store in an Array : ");
        int size = sc.nextInt();

        int prices[] = new int[size];

        System.out.println("\n---: Enter Stock Prices to store in an Array :---\n");

        for(int i = 0; i < size; i++)
        {
            prices[i] = sc.nextInt();
        }

        int ans = maxProfitOfStock(prices);

        System.out.println("\nMaximum Profit You can Achieve from this Transaction : " + ans);

        sc.close();

    }
}
