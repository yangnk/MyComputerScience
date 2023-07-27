package algorithms.leetcode.archive2022.archive10.lc1020;

import java.util.Arrays;

public class Solution3 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}
