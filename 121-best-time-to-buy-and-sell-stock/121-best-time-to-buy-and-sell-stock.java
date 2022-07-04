class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, h = prices[0], profit = 0;
        for(int i =1 ; i< prices.length;i++){
            if(prices[l]> prices[i]){
                l = i;
            }
            else {
                h = prices[i];
             profit = Math.max(profit, h-prices[l]);   
            }
        }
        return profit;
    }
}