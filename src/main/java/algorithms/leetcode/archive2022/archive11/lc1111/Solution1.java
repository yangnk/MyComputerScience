package algorithms.leetcode.archive2022.archive11.lc1111;

public class Solution1 {
    public int maxProfit(int[] prices) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int flag = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] > prices[i + 1]) {
                low = low < prices[i + 1] ? low : prices[i + 1];
                continue;
            } else if (prices[i] < prices[i + 1]) {
                low = low < prices[i] ? low : prices[i];
                high = high > prices[i + 1] ? high : prices[i + 1];
                continue;
            }
        }
        if (high > low) {
            return high - low;
        } else {
            return 0;
        }
    }
}
