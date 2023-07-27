package algorithms.leetcode.lc0605;

//
//给你一个下标从 0 开始的数组 nums ，它包含 n 个 互不相同 的正整数。请你对这个数组执行 m 个操作，在第 i 个操作中，你需要将数字 operations[i][0] 替换成 operations[i][1] 。
//
//        题目保证在第 i 个操作中：
//
//        operations[i][0] 在 nums 中存在。
//        operations[i][1] 在 nums 中不存在。
//        请你返回执行完所有操作后的数组。
//


import java.util.Arrays;

class Solution3 {
    public int[] arrayChange(int[] nums, int[][] operations) {
        for (int i = 0; i < operations.length; i++) {
            int fromValue = operations[i][0];
            int toValue = operations[i][1];
            int index = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == fromValue) {
                    index = j;
                    break;
                }
            }
            nums[index] = toValue;
        }
        return nums;
    }
}