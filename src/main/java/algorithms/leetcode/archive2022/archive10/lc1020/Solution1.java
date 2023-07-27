package algorithms.leetcode.archive2022.archive10.lc1020;

import java.util.Arrays;

public class Solution1 {
    public void moveZeroes(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                size++;
                continue;
            }
            nums[i - size] = nums[i];
        }
        Arrays.fill(nums, nums.length - size, nums.length, 0);
    }
}
