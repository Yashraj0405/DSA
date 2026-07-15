class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0] , maxprofit = 0;
        for(int sell = 1 ; sell < prices.length ; sell++){
           maxprofit = Math.max(maxprofit,(prices[sell]-buy));
           if(prices[sell]<buy){
            buy = prices[sell];
           }
        }
        return maxprofit;
    }
}