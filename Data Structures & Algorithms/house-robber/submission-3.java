class Solution {
    Integer[] dp;
    public int solve(int[] nums, int n, int i) {
        if (i >= n) {
            return 0;
        }
        if (dp[i] == null) {
            int rob = nums[i] + solve(nums, n, i + 2);

            int notRob = solve(nums, n, i + 1);
            dp[i] =  Math.max(rob, notRob);
        }
        return dp[i];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        dp = new Integer[n];
        return solve(nums, n, 0);
    }
}
