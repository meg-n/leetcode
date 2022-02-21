package ArrayProbs;

public class BuySell {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int max = maxProfit(prices);
        System.out.println(max);
    }

    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > min) {
                max = Math.max(prices[i]-min,max);
            }else{
                min = prices[i];
            }
        }
        return max;
    }
}
