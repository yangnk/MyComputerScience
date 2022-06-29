package dataStructureAndAlgorithms.leetcode.lc0410;

import java.util.Arrays;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-04-10 23:16
 **/
class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            int tmp = getMaxSubLen(Arrays.copyOfRange(nums, i, nums.length), k);
            maxLen = maxLen > tmp ? maxLen : tmp;
        }
        return maxLen;
    }

    private int getMaxSubLen(int[] ints, int k) {
        if (ints[0] == k) {
            return 1;
        }
        if (ints[0] != k) {
            return 0;
        }
        if (ints == null) {

        }



        return 0;
    }
}