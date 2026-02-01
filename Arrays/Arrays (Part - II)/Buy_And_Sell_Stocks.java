
import java.util.Scanner;

public class Buy_And_Sell_Stocks {

    public static int buyAndSellStocks(int prices[]) // Time Complexity :- O(n)
    {
        int buyPrice = Integer.MAX_VALUE;

        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++)
        {
            if(buyPrice < prices[i]) // Profit
            {
                int profit = prices[i] - buyPrice; // Today's Profit
                maxProfit = Math.max(maxProfit, profit);
            }
            else
            {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nHow many Stock Price you want to store in an Array : ");
        int size = sc.nextInt();

        int prices[] = new int[size];

        System.out.println("\n---: Enter Stock Prices for \"prices\" Array :---\n");

        for(int i = 0; i < size; i++)
        {
            prices[i] = sc.nextInt();
        }

        int maxProfitVal = buyAndSellStocks(prices);

        System.out.print("\nMax Profit you can achieve from \"prices\" Array = " + maxProfitVal);

        sc.close();

    }
}
