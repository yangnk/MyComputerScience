package algorithms.leetcode.lc0604;

import java.util.Arrays;

class Solution1 {
    public int equalSubstring(String s, String t, int maxCost) {
        int[] diff = new int[s.length()];
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        //得到差值数组
        for (int i = 0; i < s.length(); i++) {
            diff[i] = Math.abs(ch1[i] - ch2[i]);
        }
        //初始化dp[0]
        int[] dp = new int[s.length()];
        if (diff[0] <= maxCost) {
            dp[0] = 1;
        } else {
            dp[0] = 0;
        }

        for (int i = 1; i < s.length(); i++) {
            if (Arrays.stream(Arrays.copyOfRange(diff, i - dp[i - 1], i + 1)).sum() <= maxCost) {
                dp[i] = dp[i - 1] + 1;
            } else {
                dp[i] = dp[i - 1];
            }
        }
        return dp[s.length() - 1];
    }
}