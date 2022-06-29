package dataStructureAndAlgorithms.leetcode.others;

//给定一个未经排序的整数数组，找到最长且 连续递增的子序列，并返回该序列的长度。
//
//        连续递增的子序列 可以由两个下标 l 和 r（l < r）确定，如果对于每个 l <= i < r，都有 nums[i] < nums[i + 1] ，那么子序列 [nums[l], nums[l + 1], ..., nums[r - 1], nums[r]] 就是连续递增子序列。

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-01-14 14:59
 **/
public class DB0114 {
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int preVal = 0;
        int maxLen = 0;
        for (int startIndex = 0, endIndex = 0; endIndex < nums.length; endIndex++) {
            if (startIndex == endIndex) {
                preVal = nums[endIndex];
                continue;
            }
            if (nums[endIndex] > preVal) {
                preVal = nums[endIndex];
                maxLen = endIndex - startIndex + 1;
                continue;
            } else {
                startIndex = endIndex;
            }
        }
        return maxLen;
    }
}
