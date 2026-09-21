class Solution {
    public int maxProfit(int[] prices) {
        int prof = 0;
        int minPrice = prices[0];
        for(int i = 1 ; i < prices.length ; i++){
                 if(prices[i] < minPrice) {
                minPrice = prices[i];
            }
            int diff = prices[i]-minPrice;
            if(diff> prof)prof=diff;
    }
        return prof;
    }
}