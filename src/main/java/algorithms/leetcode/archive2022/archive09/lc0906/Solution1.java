package algorithms.leetcode.archive2022.archive09.lc0906;
public class Solution1 {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        if (len == 1) {
            return 0;
        }
        if (len == 2) {
            return Math.min(cost[0], cost[1]);
        }

        int[] dp = new int[len + 2];
        int[] newCost = new int[len + 2];
        System.arraycopy(cost, 0, newCost, 1, len);
        dp[1] = newCost[1];
        dp[2] = newCost[2];
        for (int i = 3; i <= len + 1; i++) {
            dp[i] = Math.min(dp[i - 1] + newCost[i], dp[i - 2] + newCost[i]);
        }
        return dp[len + 1];
    }
}
