package algorithms.leetcode.archive05.a0528;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {

    public static void main(String[] args) {
        int[][] s = differenceOfDistinctValues(new int[][]{{1, 2, 3}, {3, 1, 5}, {3, 2, 1}});
        System.out.println("s = " + s);
    }

    public static int[][] differenceOfDistinctValues(int[][] grid) {
        int rowNum = grid.length;//行数
        int colNum = grid[0].length;//列数
        int[][] ans = new int[rowNum][colNum];

        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                Set<Integer> topLeftSet = new HashSet<>();
                Set<Integer> bottomRightSet = new HashSet<>();
                int i1 = i;
                int j1 = j;
                while (--i1 >= 0 && --j1 >= 0) {
                    topLeftSet.add(grid[i1][j1]);
                }
                int i2 = i;
                int j2 = j;
                while (++i2 <= rowNum - 1 && ++j2 <= colNum - 1) {
                    bottomRightSet.add(grid[i2][j2]);
                }
                ans[i][j] = Math.abs(topLeftSet.size() - bottomRightSet.size());
            }
        }
        return ans;
    }
}
