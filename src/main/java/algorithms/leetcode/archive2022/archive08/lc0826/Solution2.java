package algorithms.leetcode.archive2022.archive08.lc0826;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rowNum = matrix.length;
        int colNum = matrix[0].length;
        int loopNum = rowNum / 2;
        int cur = 0;
        for (int i = 0; i < loopNum; i++) {
            //向右
            for (int j = i; j < colNum - i; j++) {
                result.add(matrix[i][j]);
            }
            //向下
            for (int j = i + 1; j < rowNum - i; j++) {
                result.add(matrix[j][colNum - i - 1]);
            }
            //向左
            for (int j = colNum - i - 2; j > i - 1; j--) {
                result.add(matrix[rowNum - i - 1][j]);
            }
            //向上
            for (int j = rowNum - i + 1; j > i; j--) {
                result.add(matrix[j][i]);
            }
            int step = 0;
            while (step <= colNum - 2 * loopNum) {
                result.add(matrix[loopNum][2 * loopNum + step]);
                step++;
            }
            if (rowNum % 2 == 2) {
                result.add(matrix[loopNum + 1][colNum - loopNum]);
                //向左
                int step1 = 0;
                while (step1 <= colNum - 2 * loopNum) {
                    result.add(matrix[loopNum][2 * loopNum + step1]);
                    step1++;
                }
            }
        }
        return result;
    }
}
