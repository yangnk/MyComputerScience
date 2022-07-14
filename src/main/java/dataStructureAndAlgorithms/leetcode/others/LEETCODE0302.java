package dataStructureAndAlgorithms.leetcode.others;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-03-02 23:06
 **/
public class LEETCODE0302 {
    public String longestPalindrome(String s) {
        int maxLen = 1;
        int start = 0;
        int sLen = s.length();
        boolean[][] dp = new boolean[sLen][sLen];
        char[] chars = s.toCharArray();
        for (int i = 0; i < sLen; i++) {
            dp[i][i] = true;
        }
        if (s.length() < 2) {
            return s;
        }
        for (int len = 2; len <= s.length(); len++) {
            for (int i = 0; i < s.length(); i++) {
                int j = i + len - 1;
                if (j >= sLen) {
                    break;
                }
                if (chars[i] != chars[j]) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }

                }
                if (dp[i][j] == true && j - i + 1 > maxLen) {
                    maxLen = len;
                    start = i;
                }
            }

        }
        return s.substring(start, start + maxLen);

    }
}
