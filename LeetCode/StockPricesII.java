package LeetCode;

public class StockPricesII {
    public static void main(String[] args) {
        int[] prices = { 1, 2, 3, 4, 5 };
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int sum = 0;
        int j = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                int x = prices[i];
                for (j = i + 1; j < prices.length - 1; j++) {
                    if (prices[j] > prices[j + 1]) {
                        sum += prices[j] - x;
                        break;
                    }
                }
                sum += prices[j] - x;
                i = j;
            }
        }
        return sum;
    }
}
