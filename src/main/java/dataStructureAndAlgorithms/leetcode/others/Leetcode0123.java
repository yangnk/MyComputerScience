package dataStructureAndAlgorithms.leetcode.others;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-01-23 09:00
 **/
public class Leetcode0123 {
    public int maxSubArray(int[] nums) {
        int pre = -10000;
        int maxSum = -10000;
        for (int item : nums) {
            pre = Math.max(pre + item, item);
            maxSum = Math.max(maxSum, pre);
        }
        return maxSum;
    }
}
