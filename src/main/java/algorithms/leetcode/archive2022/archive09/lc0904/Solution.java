package algorithms.leetcode.archive2022.archive09.lc0904;

public class Solution {
    public int numDecodings(String s) {
        int len = s.length();
        int[] dp = new int[len + 1];
        String s1 = " " + s;
        char[] chars = s1.toCharArray();
        dp[0] = 1;

        for (int i = 1; i <= len; i++) {
            if (chars[i] != '0') {
                dp[i] += dp[i - 1];
            }
            int tmp = 10 * (chars[i - 1] - '0') + chars[i] - '0';
            if (i >= 2 && tmp >= 10 && tmp <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[len];
    }
}
