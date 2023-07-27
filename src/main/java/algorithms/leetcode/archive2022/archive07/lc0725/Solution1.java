package algorithms.leetcode.archive2022.archive07.lc0725;

public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int i = solution1.uniquePaths(2, 3);
        System.out.println(i);
    }

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1) {
                    dp[i][j] = 1;
                    continue;
                }
                if (j == 1) {
                    dp[i][j] = dp[i][j - 1];
                } else if (i == 1) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m][n];
    }
}
