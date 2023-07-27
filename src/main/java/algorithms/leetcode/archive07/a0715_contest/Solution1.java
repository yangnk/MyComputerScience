package algorithms.leetcode.archive07.a0715_contest;

import java.util.Arrays;

public class Solution1 {
    public int maximumJumps(int[] nums, int target) {
        int len = nums.length;
        int dp[] = new int[len];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (Math.abs(nums[i] - nums[j]) <= target && dp[j] != -1) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return dp[len - 1];
    }
}
