package algorithms.leetcode.archive06.a0603;

import java.util.Arrays;

//
//输入：n = 3, queries = [[0,0,1],[1,2,2],[0,2,3],[1,0,4]]
//        输出：23
//        解释：上图展示了每个查询以后矩阵的值。所有操作执行完以后，矩阵元素之和为 23 。
public class Solution2 {

    int[][] arr;
    public long matrixSumQueries(int n, int[][] queries) {
        arr = new int[n][n];
        //二维数组全部元素置0
        for (int i = 0; i < n; i++) {
            Arrays.fill(arr[i], 0);
        }

        //分别针对typei == 0/1两种情况做处理
        for (int i = 0; i < queries.length; i++) {
            if (queries[i][0] == 0) {
                //typei == 0 改变行
                changeRowValue(queries[i][1], queries[i][2]);
            } else {
                //typei == 1 改变列
                changeColValue(queries[i][1], queries[i][2]);
            }
        }
        //二维数组全部元素累加
        Long ans = 0L;
        for (int i = 0; i < n; i++) {
            ans += Arrays.stream(arr[i]).sum();
        }
        return ans;
    }

    private void changeColValue(int colNum, int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][colNum] = value;
        }
    }

    private void changeRowValue(int rowNum, int value) {
        Arrays.fill(arr[rowNum], value);
    }
}
