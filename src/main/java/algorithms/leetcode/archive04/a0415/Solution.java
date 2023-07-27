package algorithms.leetcode.archive04.a0415;

class Solution {

    public static void main(String[] args) {
        int[][] input = {{1},{22},{333}};
        int[] columnWidth = findColumnWidth(input);
        System.out.println("columnWidth = " + columnWidth);
    }

    public static int[] findColumnWidth(int[][] grid) {

        int rowNum = grid.length;//行数
        int colNum = grid[0].length;//列数
        int[] res = new int[colNum];

        for (int i = 0; i < colNum; i++) {
            int maxLen = 0;
            for (int j = 0; j < rowNum; j++) {
                int len = String.valueOf(grid[j][i]).length();
                if (len > maxLen) {
                    maxLen = len;
                }
            }
            res[i] = maxLen;
        }
        return res;
    }
}
