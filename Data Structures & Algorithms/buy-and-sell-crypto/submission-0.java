class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0], i = 1, n = prices.length;
  
        int maxProfit = 0;
        while (i < n) {
            int cost = prices[i] - min;
            maxProfit = Math.max(cost, maxProfit);
            min = Math.min(min, prices[i]);
            i++;
        }

        return maxProfit;
    }
}
