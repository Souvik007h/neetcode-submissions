
class Solution {
    Integer[] dp;

    public int solve(int[] nums, int n, int i) {
        if (i >= n) {
            return 0;
        }

        if (dp[i] == null) {
            int rob = nums[i] + solve(nums, n, i + 2);
            int notRob = solve(nums, n, i + 1);

            dp[i] = Math.max(rob, notRob);
        }

        return dp[i];
    }

    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        // Case 1: Skip first house
        dp = new Integer[n];
        int skipFirst = solve(nums, n, 1);

        // Case 2: Skip last house
        dp = new Integer[n];
        int skipLast = solve(nums, n - 1, 0);

        return Math.max(skipFirst, skipLast);
    }
}
