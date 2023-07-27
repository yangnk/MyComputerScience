package algorithms.leetcode.archive2022.archive11.lc1120;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.lengthOfLongestSubstring("pwwkew");
        System.out.println("i = " + i);
    }

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return s.length();
        }
        int max = 1;
        int i = 0;
        int[] dp = new int[s.length()];
        dp[0] = 1;
        for (int j = 1; j < s.length(); j++) {
            if (!s.substring(i, j).contains(s.substring(j, j + 1)) && j - i + 1 > max) {
                max += 1;
                dp[j] = max;
            } else {
                dp[j] = dp[j - 1];
                int lastIndex = s.substring(i, j).lastIndexOf(s.substring(j, j + 1));
                i = i + lastIndex + 1;
                max = dp[j] > max ? dp[j] : max;
            }
        }
        return max;
    }
}
