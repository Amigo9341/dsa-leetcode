class Solution {
    public int maxProfit(int[] prices) {
        
        int smallest = prices[0];
        int maxProfit = 0;

        for(int i = 1; i<prices.length; i++){

            if(prices[i] > smallest){
                int profit = prices[i] - smallest;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                smallest = prices[i];
            }
        }
        return maxProfit;
    }
}