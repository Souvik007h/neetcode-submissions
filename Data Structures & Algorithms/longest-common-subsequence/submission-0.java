class Solution {
    Integer[][] dp;
    public int solve(char s1[], char s2[], int i, int j) {
        if (i < 0 || j < 0) {
            return 0;
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }
        if (s1[i] == s2[j]) {
            return dp[i][j] = 1 + solve(s1, s2, i - 1, j - 1);
        }

        return dp[i][j] = Math.max(solve(s1, s2, i - 1, j), solve(s1, s2, i, j - 1));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length() - 1, m = text2.length() - 1;
        dp = new Integer[n + 1][m + 1];
        return solve(text1.toCharArray(), text2.toCharArray(), n, m);
    }
}
