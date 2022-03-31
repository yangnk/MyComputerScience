package dataStructureAndAlgorithms.leetcode.others;

import java.util.Arrays;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-01-18 23:26
 **/
public class DB0118 {
    public static void main(String[] args) {
        int[] nums = {1,1000};
        System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums) {
        //一个元素时候
        if (nums.length == 1 && nums[0] != 1) {
            return 1;
        }
        if (nums.length == 1 && nums[0] == 1) {
            return 2;
        }
        Arrays.sort(nums);
        if (Arrays.binarySearch(nums, 1) < 0) {
            return 1;
        } else {
            if (nums[nums.length - 1] < 1) {
                return 1;
            }
            for (int i = 0, j = 1; i <= nums.length - 2; i++, j++) {
                if (nums[i] < 1) {
                    continue;
                }
                if (nums[j] - nums[i] == 1||nums[j] - nums[i] == 0) {
                    continue;
                }
                return nums[i] + 1;
            }
            return nums[nums.length - 1] + 1;
        }
    }
}
