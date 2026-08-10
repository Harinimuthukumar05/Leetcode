class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        int[][] dp = new int[m][n];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        return dis(m - 1, n - 1, word1, word2, dp);
    }

    public static int dis(int i, int j, String s1, String s2, int[][] dp) {
        if (i < 0)
            return j + 1;

        if (j < 0)
            return i + 1;

        if (dp[i][j] != -1)
            return dp[i][j];

        if (s1.charAt(i) == s2.charAt(j)) {
            return dp[i][j] = dis(i - 1, j - 1, s1, s2, dp);
        } else {
            int insert = 1 + dis(i, j - 1, s1, s2, dp);
            int delete = 1 + dis(i - 1, j, s1, s2, dp);
            int replace = 1 + dis(i - 1, j - 1, s1, s2, dp);

            return dp[i][j] = Math.min(insert, Math.min(delete, replace));
        }
    }

}