package dataStructureAndAlgorithms.leetcode.lc0708;

/**
 * @author yangningkai
 * @create 2022-07-08 23:24
 **/

public class Solution2 {
    public boolean check(int[] nums) {
        if (nums.length <= 2) {
            return true;
        }
        int count = 0;
        int left = 0;
        int right = 1;
        while (right <= nums.length - 1) {
            if (nums[left] > nums[right]) {
                count++;
            }
            left++;
            right++;
        }
        if (count == 0) {
            return true;
        } else if (count == 1) {
            if (nums[0] < nums[nums.length - 1]) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
