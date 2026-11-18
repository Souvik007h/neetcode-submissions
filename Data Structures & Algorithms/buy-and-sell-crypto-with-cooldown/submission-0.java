class Solution {
    Integer[][][] dp;
    public int solve(int arr[], int n, int i, int buy, int cooldown) {
        if (i >= n) {
            return 0;
        }

        if (dp[i][buy][cooldown] != null) {
            return dp[i][buy][cooldown];
        }
        // skip
        int profit = solve(arr, n, i + 1, buy, 0);

        // Buy
        if (buy == 1 && cooldown == 0) {
            int buyProfit = solve(arr, n, i + 1, 0, 0) - arr[i];
            profit = Math.max(profit, buyProfit);
        }

        if (buy == 0 && cooldown == 0) {
            int sellProfit = arr[i] + solve(arr, n, i + 1, 1, 1);
            profit = Math.max(profit, sellProfit);
        }

        return dp[i][buy][cooldown] = profit;
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        dp = new Integer[n + 1][2][2];
        return solve(prices, n, 0, 1, 0);
    }
}
