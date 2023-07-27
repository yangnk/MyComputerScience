package algorithms.leetcode.archive02.a0226;

//给你一个下标从 0 开始的整数数组 nums ，请你找出一个下标从 0 开始的整数数组 answer ，其中：
//
//        answer.length == nums.length
//        answer[i] = |leftSum[i] - rightSum[i]|
//        其中：
//
//        leftSum[i] 是数组 nums 中下标 i 左侧元素之和。如果不存在对应的元素，leftSum[i] = 0 。
//        rightSum[i] 是数组 nums 中下标 i 右侧元素之和。如果不存在对应的元素，rightSum[i] = 0 。
//        返回数组 answer 。
//


import java.util.Arrays;

public class Solution {

    public int[] leftRigthDifference(int[] nums) {
        int ans[] = new int[nums.length];
        int leftSum = 0;
        int rightSum = Arrays.stream(nums).sum() - nums[0];
        for (int i = 0; i < nums.length; i++) {
            int value = Math.abs(leftSum - rightSum);
            ans[i] = value;
            leftSum += nums[i];
            rightSum = i < nums.length - 1 ? rightSum - nums[i + 1] : 0;
        }
        return ans;
    }
}
