package algorithms.leetcode.archive02.a0211.weekly;
//
//
//给你一个由正整数组成的整数数组 nums ，返回其中可被 3 整除的所有偶数的平均值。
//
//        注意：n 个元素的平均值等于 n 个元素 求和 再除以 n ，结果 向下取整 到最接近的整数。
//

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int averageValue(int[] nums) {
        int count = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 == 0 && nums[i] % 2 == 0 ) {
                sum += nums[i];
                count++;
            }
        }

        if (count == 0) {
            return 0;
        }

        int avg = sum / count;
        return avg;
    }
}
