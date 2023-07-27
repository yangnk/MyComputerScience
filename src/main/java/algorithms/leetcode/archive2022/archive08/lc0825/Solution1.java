package algorithms.leetcode.archive2022.archive08.lc0825;

public class Solution1 {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String[] dp = new String[n + 1];
        dp[1] = "1";
        for (int i = 2; i <= n; i++) {
            String ans = getNumAndCount(dp[i - 1]);
            dp[i] = ans;
        }
        return dp[n];
    }

    private String getNumAndCount(String preNumAndCount) {
        StringBuilder sb = new StringBuilder();
        String num = preNumAndCount.substring(0, 1);
        int count = 0;
        for (int i = 0; i < preNumAndCount.length(); i++) {
            if (preNumAndCount.substring(i, i + 1).equals(num)) {
                count++;
            } else {
                sb.append(count);
                sb.append(num);
                num = preNumAndCount.substring(i, i + 1);
                count = 1;
            }
            //最后一个
            if (i == preNumAndCount.length() - 1) {
                sb.append(count);
                sb.append(num);
            }
        }
        return new String(sb);
    }
}
