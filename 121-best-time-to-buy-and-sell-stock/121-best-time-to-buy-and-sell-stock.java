class Solution {
    public int maxProfit(int[] prices) {
        int l = 0; int h = prices[0];
        int profit = 0;
        for(int i =0;i< prices.length;i++){
            if(prices[i]<prices[l]){
                l = i;
            } 
            profit = Math.max(profit, prices[i]-prices[l]);
        }
        return profit;
    }
}