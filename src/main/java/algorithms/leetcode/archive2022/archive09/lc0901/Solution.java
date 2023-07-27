package algorithms.leetcode.archive2022.archive09.lc0901;

import java.util.Arrays;

public class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count0++;
            } else if (nums[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        Arrays.fill(nums, 0, count0, 0);
        Arrays.fill(nums, count0, count0 + count1, 1);
        Arrays.fill(nums, count0 + count1, count0 + count1 + count2, 2);
    }
}
