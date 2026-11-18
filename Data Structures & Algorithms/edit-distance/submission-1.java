class Solution {
    Integer[][] dp;
    public int solve(char w1[], char w2[], int i, int j) {
        if (i < 0)
            return j + 1;
        if (j < 0)
            return i + 1;

        if (dp[i][j] != null) {
            return dp[i][j];
        }

        // Char matches
        if (w1[i] == w2[j]) {
            return dp[i][j] = solve(w1, w2, i - 1, j - 1);
        }

        int insert = 1 + solve(w1, w2, i - 1, j);
        int delete = 1 + solve(w1, w2, i, j - 1);
        int replace = 1 + solve(w1, w2, i - 1, j - 1);
        return dp[i][j] = Math.min(insert, Math.min(delete, replace));
    }
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        dp = new Integer[n + 1][m + 1];
        return solve(word1.toCharArray(), word2.toCharArray(), n - 1, m - 1);
    }
}
