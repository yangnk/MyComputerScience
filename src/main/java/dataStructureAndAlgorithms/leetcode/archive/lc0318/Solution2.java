package dataStructureAndAlgorithms.leetcode.lc0318;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-03-18 23:09
 **/
public class Solution2 {
    int count = 0;

    public int findTargetSumWays(int[] nums, int target) {
        backtrack(nums, target, 0, 0);
        return count;
    }

    public void backtrack(int[] nums, int target, int index, int sum) {
        if (index == nums.length) {
            if (sum == target) {
                count++;
            }
        } else {
            backtrack(nums, target, index + 1, sum + nums[index]);
            backtrack(nums, target, index + 1, sum - nums[index]);
        }
    }
}


//class Solution {
//    int count = 0;
//
//    public int findTargetSumWays(int[] nums, int target) {
//        backtrack(nums, target, 0, 0);
//        return count;
//    }
//
//    public void backtrack(int[] nums, int target, int index, int sum) {
//        if (index == nums.length) {
//            if (sum == target) {
//                count++;
//            }
//        } else {
//            backtrack(nums, target, index + 1, sum + nums[index]);
//            backtrack(nums, target, index + 1, sum - nums[index]);
//        }
//    }
//}
