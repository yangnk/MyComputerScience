package dataStructureAndAlgorithms.leetcode.lc0708;

import java.util.Arrays;

/**
 * @author yangningkai
 * @create 2022-07-08 16:20
 **/

public class Solution1 {
    public int minSwaps(int[] chess) {
        int sumOne = Arrays.stream(chess).sum();
        int left = 0;
        int right = sumOne - 1;
        int curOne = Arrays.stream(Arrays.copyOfRange(chess, 0, sumOne)).sum();
        int maxOne = curOne;
        while (right < chess.length - 1) {
            left++;
            right++;
            curOne = (chess[left - 1] == 1 ? curOne - 1 : curOne);
            curOne = (chess[right] == 1 ? curOne + 1 : curOne);
            if (curOne > maxOne) {
                maxOne = curOne;
            }
        }
        return sumOne - maxOne;
    }
}
