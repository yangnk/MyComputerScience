package dataStructureAndAlgorithms.leetcode.lc0525;

import java.util.HashSet;
import java.util.Set;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-05-26 11:02
 **/

//https://leetcode.cn/problems/unique-substrings-in-wraparound-string/submissions/

//    467. 环绕字符串中唯一的子字符串
//            把字符串 s 看作 "abcdefghijklmnopqrstuvwxyz" 的无限环绕字符串，所以 s 看起来是这样的：
//            "...zabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcd...." 。
//            现在给定另一个字符串 p 。返回 s 中 不同 的 p 的 非空子串 的数量 。

class Solution {


    public int findSubstringInWraproundString1(String p) {
        int[] dp = new int[p.length()];
        Set<String> set = new HashSet<>();
        char[] chars = p.toCharArray();
        dp[0] = 1;
        set.add(p.substring(0, 1));
        if (p.length() == 2) {
            if (chars[0] == chars[1]) {
                dp[1] = 1;
            } else if (((chars[1] - chars[0] + 26) % 26 == 1)) {
                dp[1] = 3;
            } else {
                dp[1] = 2;
            }
        }

        for (int i = 2; i < p.length(); i++) {
            //s[i]重复且连不上前一个子串
            if (set.contains(p.substring(i, i + 1)) && ((chars[i] - chars[i - 1] + 26) % 26 != 1)) {
                dp[i] = dp[i - 1];
                System.out.printf("===1===dp[i]:%d", dp[i]);
                System.out.println();
                continue;
            }
            //s[i]不重复且连不上前一个子串
            if (!set.contains(p.substring(i, i + 1)) && ((chars[i] - chars[i - 1] + 26) % 26 != 1)) {
                dp[i] = dp[i - 1] + 1;
                set.add(p.substring(i, i + 1));
                System.out.printf("==2===dp[i]:%d", dp[i]);
                System.out.println();
                continue;
            }
            //s[i]重复且能连上前一个子串
            if (set.contains(p.substring(i, i + 1)) && ((chars[i] - chars[i - 1] + 26) % 26 == 1)) {
                dp[i] = 2 * dp[i - 1] - dp[i - 2];
                System.out.printf("===3===dp[i]:%d", dp[i]);
                System.out.println();
                continue;
            }
            //s[i]不重复且能连上前一个子串
            if (!set.contains(p.substring(i, i + 1)) && ((chars[i] - chars[i - 1] + 26) % 26 == 1)) {
                dp[i] = 2 * dp[i - 1] + 1 - dp[i - 2];
                System.out.printf("===4===dp[i]:%d", dp[i]);
                System.out.println();
                set.add(p.substring(i, i + 1));
                continue;
            }
        }
        return dp[p.length() - 1];
    }

    public int findSubstringInWraproundString(String p) {
        char[] chars = p.toCharArray();
        Set<String> set = new HashSet<>();
        int count = 1;
        set.add(p.substring(0, 1));

        for (int i = 1; i < p.length(); i++) {
            if (!set.contains(p.substring(i, i + 1))) {
                set.add(p.substring(i, i + 1));
                count++;
            }

            for (int j = i - 1; j >= 0; j--) {
                if ((chars[j + 1] - chars[j] + 26) % 26 == 1) {
                    if (!set.contains(p.substring(j, i + 1))) {
                        set.add(p.substring(j, i + 1));
                        count++;
                    }
                    continue;
                }
                break;
            }
        }
        return count;
    }
}