package algorithms.leetcode.archive2022.archive08.lc0826;


public class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        int[][] newMatrix = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                newMatrix[j][len - i - 1] = matrix[i][j];
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                matrix[i][j] = newMatrix[i][j];
            }
        }
    }
}
