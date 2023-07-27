package algorithms.leetcode.archive06.a0618_contest;

//
//给你一个 正 整数数组 nums 。
//
//        将 nums 分成两个数组：nums1 和 nums2 ，并满足下述条件：
//
//        数组 nums 中的每个元素都属于数组 nums1 或数组 nums2 。
//        两个数组都 非空 。
//        分区值 最小 。
//        分区值的计算方法是 |max(nums1) - min(nums2)| 。
//
//        其中，max(nums1) 表示数组 nums1 中的最大元素，min(nums2) 表示数组 nums2 中的最小元素。
//
//        返回表示分区值的整数。

import java.util.Arrays;

public class Solution1 {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int minValue = Integer.MAX_VALUE;
        for (int i = 1; i <= nums.length - 1; i++) {
            int subValue = nums[i] - nums[i - 1];
            if (subValue == 0) {
                return 0;
            }
            if (subValue < minValue) {
                minValue = subValue;
            }
        }
        return minValue;
    }
}