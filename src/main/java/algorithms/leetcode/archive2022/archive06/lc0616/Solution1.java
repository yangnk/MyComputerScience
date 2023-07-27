package algorithms.leetcode.lc0616;


//
//1422. 分割字符串的最大得分
//        给你一个由若干 0 和 1 组成的字符串 s ，请你计算并返回将该字符串分割成两个 非空 子字符串（即 左 子字符串和 右 子字符串）所能获得的最大得分。
//
//        「分割字符串的得分」为 左 子字符串中 0 的数量加上 右 子字符串中 1 的数量。

class Solution1 {
    public int maxScore(String s) {
        int maxScore = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int tmp = 0;
            for (int j = 0; j < s.length(); j++) {
                if (j <= i && s.charAt(j) == '0') {
                    tmp++;
                }
                if (j > i && s.charAt(j) == '1') {
                    tmp++;
                }
            }
            if (tmp > maxScore) {
                maxScore = tmp;
            }
        }
        return maxScore;
    }
}