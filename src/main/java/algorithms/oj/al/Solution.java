package algorithms.oj.al;

//给你一个长度为 n 的整数数组 nums 和 一个目标值 target。请你从 nums 中选出三个整数，使它们的和与 target 最接近
//        。返回这三个数的和。
//
//        假定每组输入只存在恰好一个解。
//
//        示例：
//
//        输入：nums = [-1,2,1,-4], target = 1
//        输出：2
//        解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2)

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int target = 10;
        int closestSum = getClosestSum(nums, target);
        System.out.println("closestSum = " + closestSum);
    }

    public static int getClosestSum(int[] nums, int target) {
        Arrays.sort(nums);
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];
        int presum = Math.abs(a + b + c - target);
        int closestSum = Integer.MAX_VALUE;

        flag:
        for (int i = 0; i <= nums.length - 3; i++) {
            for (int j = i + 1; j <= nums.length - 2; j++) {
                for (int k = j + 1; k <= nums.length - 1; k++) {
                    int aa = nums[i];
                    int bb = nums[j];
                    int cc = nums[k];
                    int sum = Math.abs(aa + bb + cc - target);
                    if (sum < closestSum) {
                        closestSum = sum;
                    }
                    if (sum > presum) {
                        break flag;
                    }
                    if ((i == nums.length - 3) && (j == nums.length - 2) && (k == nums.length - 1)) {
                        return target - closestSum;
                    }
                }
            }
        }
        return closestSum + target;
    }
}
