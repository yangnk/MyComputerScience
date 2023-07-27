package dataStructureAndAlgorithms.leetcode.lc0523;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-05-24 09:29
 **/
class Solution1 {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int maxWidth = 0;
        for (int i = 0; i <= points.length - 2; i++) {
            int tmp = points[i + 1][0] - points[i][0];
            if (tmp > maxWidth) {
                maxWidth = tmp;
            }
        }
        return maxWidth;
    }
}