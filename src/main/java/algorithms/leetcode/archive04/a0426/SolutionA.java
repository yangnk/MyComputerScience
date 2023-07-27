package algorithms.leetcode.archive04.a0426;

import java.util.Arrays;
//
//输入：nums = [-1,2,1,-4], target = 1
//        输出：2
//        解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。


public class SolutionA {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 8, 9, 10};
        int target = 16;

        int sumClosest = threeSumClosest(nums, target);

        System.out.println("sumClosest = " + sumClosest);
    }


    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        //默认最接近值
        int sumClosest = Math.abs(nums[0] + nums[1] + nums[2] - target);
        //特殊判定，target大于最大的三个值
        int len = nums.length;
        if (nums[len - 1] + nums[len - 2] + nums[len - 3] <= target) {
            return nums[len - 1] + nums[len - 2] + nums[len - 3];
        }
        //特殊判定，target小于最小的三个值
        if (nums[0] + nums[1] + nums[2] >= target) {
            return nums[0] + nums[1] + nums[2];
        }

        int flag = 0;
        //从左到右循环做第一个节点
        for (int i = 0; i <= nums.length - 3; i++) {
            int firstValue = nums[i];
            int start = i + 1;
            int end = nums.length - 1;
            int left = target - firstValue;

            while (end - start > 1) {
                int startValue = nums[start];
                int endValue = nums[end];
                if (left > startValue + endValue) {
                    start++;
                }
                if (left < startValue + endValue) {
                    end--;
                }
                if (left == startValue + endValue) {
                    return target;
                }
            }
            int sum = Math.abs(nums[i] + nums[start] + nums[end] - target);

            if (sum < sumClosest) {
                sumClosest = sum;
                flag = nums[i] + nums[start] + nums[end] - target;
            }
        }
        if (flag > 0) {
            return target+sumClosest;
        }
        if (flag < 0) {
            return target-sumClosest;
        }
        return 0;
    }
}
