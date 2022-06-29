package dataStructureAndAlgorithms.leetcode.lc0518;

import java.util.HashSet;
import java.util.Set;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-05-18 22:38
 **/
class Solution {
    public static void main(String[] args) {
        System.out.printf("//output:%s//",distinctSubseqII("aba"));
    }
    public static int distinctSubseqII(String s) {
        //s长度为1
        if (s.length() == 1) {
            return 1;
        }
        //s长度为2
        if (s.length() == 2) {
            if (s.toCharArray()[0] == s.toCharArray()[1]) {
                return 2;
            }else {
                return 3;
            }

        }
        //初始化
        int[] dp = new int[s.length()];
        dp[0] = 1;
        if (s.toCharArray()[0] == s.toCharArray()[1]) {
            dp[1] = 2;
        }else {
            dp[1] = 3;
        }
        Set<Character> existChar = new HashSet<>();
        existChar.add(s.toCharArray()[0]);
        existChar.add(s.toCharArray()[1]);
        //动态规划
        for (int i = 2; i < s.length(); i++) {
            if (existChar.contains(s.toCharArray()[i])) {
                System.out.printf("s:%s,i:%d", s, i);
                int lastIndex = s.substring(0, i).lastIndexOf(s.charAt(i));
                System.out.printf("//lastIndex:%d",lastIndex);
                int dif;
                if (lastIndex == 0) {
                    dif = 1;
                }else {
                    dif = dp[lastIndex - 1];
                }
                dp[i] = 2 * dp[i - 1] + 1 - dif;
            } else {
                dp[i] = 2 * dp[i - 1] + 1;
            }
            existChar.add(s.toCharArray()[i]);
            System.out.printf("dp[%d]=%d", i, dp[i]);
        }
        return dp[s.length() - 1];
    }
}
