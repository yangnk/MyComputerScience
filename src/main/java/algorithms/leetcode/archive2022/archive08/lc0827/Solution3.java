package algorithms.leetcode.archive2022.archive08.lc0827;

public class Solution3 {
    public int[][] largestLocal(int[][] grid) {
        int len = grid.length;
        int newLen = len - 2;
        int[][] ans = new int[newLen][newLen];
        for (int i = 0; i < newLen; i++) {
            for (int j = 0; j < newLen; j++) {
                int maxVal = 0;
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        if (grid[k][l] > maxVal) {
                            maxVal = grid[k][l];
                        }
                    }
                }
                ans[i][j] = maxVal;
            }
        }
        return ans;
    }
}
