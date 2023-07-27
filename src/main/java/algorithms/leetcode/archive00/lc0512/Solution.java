package dataStructureAndAlgorithms.leetcode.lc0512;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-05-12 20:19
 **/
public class Solution {

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                System.out.println("i:" + i + "j:" + j + "," + dp[i][j]);
            }
        }
        return dp[m - 1][n - 1];
    }

//    public int uniquePaths(int m, int n) {
//        int[][] arr = new int[m + 1][n + 1];
//        if (m > 1 && n > 1) {
//            arr[m][n] = arr[m - 1][n] + arr[m][n - 1];
//        } else if (n == 1) {
//            arr[m][n] = arr[m - 1][n];
//        } else if (m == 1) {
//            arr[m][n] = arr[m][n - 1];
//        }
//        if (m == 1 && n == 1) {
//            arr[1][1] = 1;
//        }
//        return arr[m][n];
//    }
}
