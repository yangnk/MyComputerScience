package algorithms.leetcode.archive2022.archive12.lc1224;

public class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length + 1][grid[0].length + 1];
        dp[1][1] = grid[0][0];
        if (grid.length == 1 && grid[0].length == 1) {
            return dp[1][1];
        }
        for (int i = 2; i < grid[0].length + 1; i++) {
            dp[1][i] = grid[0][i - 1] + dp[1][i - 1];
        }
        for (int i = 2; i < grid.length + 1; i++) {
            dp[i][1] += grid[i - 1][0] + dp[i - 1][1];
        }

        for (int i = 2; i < grid.length + 1; i++) {
            for (int j = 2; j < grid[0].length + 1; j++) {
                dp[i][j] = Math.min(dp[i - 1][j] + grid[i - 1][j - 1], dp[i][j - 1] + grid[i - 1][j - 1]);
            }
        }
        return dp[grid.length][grid[0].length];
    }
}
