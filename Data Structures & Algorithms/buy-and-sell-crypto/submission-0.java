class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maximumProfit = 0;
        int minimumPrice = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            int profit = prices[i] - minimumPrice;
            minimumPrice = Math.min(minimumPrice, prices[i]);
            maximumProfit = Math.max(maximumProfit, profit);
        }
        return maximumProfit;
    }
}
