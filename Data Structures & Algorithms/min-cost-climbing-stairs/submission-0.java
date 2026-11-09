class Solution {
    Integer[] dp;
    public int solve(int[] cost, int n, int i){
        if(i >= n){
            return 0;
        }
        if(dp[i] == null){
            dp[i] = cost[i] + Math.min(solve(cost, n, i+1), solve(cost, n, i+2));
        }
        return dp[i];
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        dp = new Integer[n];
        return Math.min(solve(cost, n, 0), solve(cost, n, 1));
    }
}
