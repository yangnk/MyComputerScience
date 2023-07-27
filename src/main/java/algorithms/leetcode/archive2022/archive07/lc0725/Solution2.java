package algorithms.leetcode.archive2022.archive07.lc0725;

//0-1背包问题
public class Solution2 {
    public static void main(String[] args) {
        int[] weight = {1, 3, 4};
        int[] value = {15, 20, 30};
        int bagsize = 4;
        int weightbag = weightbag(weight, value, bagsize);
        System.out.println("weightbag = " + weightbag);
    }

    private static int weightbag(int[] weight, int[] value, int bagsize) {
        int[][] dp = new int[weight.length][bagsize + 1];

        for (int i = 0; i < weight.length; i++) {
            dp[i][0] = 0;
        }

        for (int i = 0; i < bagsize; i++) {
            if (i < weight[0]) {
                dp[0][i] = 0;
            } else {
                dp[0][i] = value[0];
            }
        }
        for (int i = 1; i < weight.length; i++) {
            for (int j = 1; j <= bagsize; j++) {
                if (j < weight[i]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i]] + value[i]);
                }
            }
        }
        return dp[weight.length - 1][bagsize];
    }
}
