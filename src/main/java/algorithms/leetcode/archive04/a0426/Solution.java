package algorithms.leetcode.archive04.a0426;

//
//给你一个长度为 n 的整数数组 nums 和 一个目标值 target。请你从 nums 中选出三个整数，使它们的和与 target 最接近。
//
//        返回这三个数的和。
//
//        假定每组输入只存在恰好一个解。
//
//
//
//        示例 1：
//
//        输入：nums = [-1,2,1,-4], target = 1
//        输出：2
//        解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。


import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
//        int[] nums = {-1, 2, 1, -4};
        int[] nums = {0, 0, 0};
        int target = 1;

        int closest = threeSumClosest(nums, target);

        System.out.println("closest = " + closest);
    }

    public static int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int preSum = Math.abs(nums[0] + nums[1] + nums[2] - target);
        int closestSum = Integer.MAX_VALUE;
        int sum = Integer.MAX_VALUE;
        flag:
        for (int i = 0; i <= nums.length - 3; i++) {
            for (int j = i + 1; j <= nums.length - 2; j++) {
                for (int k = j + 1; k <= nums.length - 1; k++) {
                    int a = nums[i];
                    int b = nums[j];
                    int c = nums[k];
                    sum = a + b + c;
                    int abs = Math.abs(sum - target);
                    if (abs < closestSum) {
                        closestSum = abs;
                    }
                    if (abs > preSum) {
                        break flag;
                    }
                    preSum = abs;
                }
            }
        }
        return sum;
    }



}
