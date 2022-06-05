class Solution {
    public int maxProfit(int[] prices) {
        int low = prices[0], high = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]> low)
                high = Math.max(high,prices[i]-low);
            else 
                low= prices[i];
        }
        return high;
    }
}