package algorithms.leetcode.archive2022.archive07.lc0718;

public class Solution {
    int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        backTrace(nums, target, 0, 0);
        return count;
    }

    public void backTrace(int[] nums, int target, int index, int sum) {
        if (index == nums.length) {
            if (sum == target) {
                count++;
            }
        } else {
            backTrace(nums, target, index+1, sum + nums[index]);
            backTrace(nums, target, index+1, sum - nums[index]);
        }
    }
}
