package algorithms.leetcode.archive05.a0510;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solutiona {


    List<List<String>> ret = new ArrayList<List<String>>();
    List<String> ans = new ArrayList<String>();
    int[][] dp;

    public List<List<String>> partition(String s) {
        dp = new int[s.length()][s.length()];

        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (i == j) {
                    dp[i][j] = 1;
                    continue;
                }
                if (i + 1 == j) {
                    String s1 = s.substring(i, i + 1);
                    String s2 = s.substring(j, j + 1);
                    dp[i][j] = s1.equals(s2) ? 1 : -1;
                    continue;
                }
                String s1 = s.substring(i, i + 1);
                String s2 = s.substring(j, j + 1);
                int i1 = dp[i + 1][j - 1];
                if (s1.equals(s2) && i1 == 1) {
                    dp[i][j] = 1;
                }
            }
        }

        backTrace(s, 0);
        return ret;
    }

    private void backTrace(String s, int i) {
        if (i == s.length()) {
            ret.add(new ArrayList<>(ans));
            return;
        }
        for (int j = i; j < s.length(); j++) {
            if (dp[i][j] == 1) {
                ans.add(s.substring(i, j + 1));
                backTrace(s, j + 1);
                ans.remove(ans.size() - 1);
            }
        }
    }
}
