class Solution {
    Integer[][] dp;
    public int solve(int i, int j, int m, int n) {
        if (i == m && j == n) {
            return 1;
        }

        if (j == n) {
            return solve(i + 1, j, m, n);
        }

        if (i == m) {
            return solve(i, j + 1, m, n);
        }
        if (dp[i][j] == null) {
            dp[i][j] = solve(i + 1, j, m, n) + solve(i, j + 1, m, n);
        }
        return dp[i][j];
    }
    public int uniquePaths(int m, int n) {
        dp = new Integer[m + 1][n + 1];
        return solve(0, 0, m - 1, n - 1);
    }
}
