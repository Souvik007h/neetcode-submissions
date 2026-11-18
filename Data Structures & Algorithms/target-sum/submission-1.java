
class Solution {
    Integer[][] dp;
    int offset = 20000;

    public int solve(int[] arr, int n, int i, int tar) {

        if (i == n) {
            return tar == 0 ? 1 : 0;
        }

        if (dp[i][tar + offset] != null) {
            return dp[i][tar + offset];
        }

        int positive = solve(arr, n, i + 1, tar - arr[i]);

        int negative = solve(arr, n, i + 1, tar + arr[i]);

        return dp[i][tar + offset] = positive + negative;
    }

    public int findTargetSumWays(int[] nums, int target) {

        int n = nums.length;

        dp = new Integer[n][40001];

        return solve(nums, n, 0, target);
    }
}
