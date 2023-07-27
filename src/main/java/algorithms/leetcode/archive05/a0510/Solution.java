//package algorithms.leetcode.archive05.a0510;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Solution {
//
//    public List<List<String>> partition(String s) {
//        int[][] dp = new int[s.length() + 1][s.length() + 1];
//        char[] chars = s.toCharArray();
//        List<List<String>> res = new ArrayList<>();
//
//        Arrays.fill(dp, -1);
//        for (int i = 0; i <= s.length(); i++) {
//            for (int j = 0; j <= s.length(); j++) {
//                if (i > j) {
//                    break;
//                }
//                if (i == j) {
//                    dp[i][j] = 1;
//                }
//                if (i + 1 == j) {
//                    dp[i][j] = 1;
//                    String s1 = s.substring(i, j);
//                }
//                if (dp[i + 1] == dp[j - 1] && chars[i] == chars[j - 1]) {
//                    dp[i][j] = 1;
//
//                } else {
//                    dp[i][j] = 0;
//                }
//            }
//        }
//    }
//
//
//}
