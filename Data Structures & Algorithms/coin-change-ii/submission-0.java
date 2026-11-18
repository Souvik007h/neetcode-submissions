class Solution {
    Integer[][] dp;
    public int solve(int arr[], int n, int i, int tar) {
        if (tar == 0) {
            return 1;
        }

        if (i >= n || tar < 0) {
            return 0;
        }

        if (dp[i][tar] != null) {
            return dp[i][tar];
        }
        int pick = solve(arr, n, i, tar - arr[i]); // pick
        int notPick = solve(arr, n, i + 1, tar);
        return dp[i][tar] = pick + notPick;
    }
    public int change(int amount, int[] coins) {
        int n = coins.length;
        dp = new Integer[n+1][amount+1];
        return solve(coins, n, 0, amount);
    }
}
