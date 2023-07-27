package algorithms.leetcode.archive01.a0108;

//
//给你一个按 非递减顺序 排列的数组 nums ，返回正整数数目和负整数数目中的最大值。
//
//        换句话讲，如果 nums 中正整数的数目是 pos ，而负整数的数目是 neg ，返回 pos 和 neg二者中的最大值。
//        注意：0 既不是正整数也不是负整数。
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {5, 20, 66, 1314};
        int maximumCount = solution.maximumCount(nums);
        System.out.println("maximumCount = " + maximumCount);
    }

    public int maximumCount(int[] nums) {
        int len = nums.length;
        int left = -1;
        int right = len;
        for (int i = 0; i < len; i++) {
            if (nums[i] < 0) {
                left = i;
                continue;
            }
            if (nums[i] > 0) {
                right = i;
                break;
            }
        }
        return len - right > left + 1 ? len - right : left + 1;
    }
}
