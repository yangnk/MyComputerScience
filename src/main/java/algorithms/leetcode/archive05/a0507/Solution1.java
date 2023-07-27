package algorithms.leetcode.archive05.a0507;

import java.util.Arrays;

public class Solution1 {

    public int[] colorTheArray(int n, int[][] queries) {

        int[] res = new int[queries.length];
        int[] arr = new int[n];
        Arrays.fill(arr, 0);
        int cur = 0;

        for (int i = 0; i < queries.length; i++) {
            int index = queries[i][0];
            int color = queries[i][1];
            int oldLeft = 0;
            int oldRight = 0;
            int newLeft = 0;
            int newRight = 0;

            if (index - 1 >= 0) {
                oldLeft = ((arr[index - 1] == arr[index] && arr[index] != 0) ? 1 : 0);
                newLeft = ((arr[index - 1] == color && color != 0) ? 1 : 0);
            }
            if (index + 1 <= n - 1) {
                oldRight = ((arr[index + 1] == arr[index] && arr[index] != 0) ? 1 : 0);
                newRight = ((arr[index + 1] == color && color != 0) ? 1 : 0);
            }
            arr[index] = color;
            int dif = newLeft + newRight - oldLeft - oldRight;
            cur += dif;
            res[i] = cur;
        }
        return res;
    }
}
