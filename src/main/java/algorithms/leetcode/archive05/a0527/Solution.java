package algorithms.leetcode.archive05.a0527;

import java.util.Arrays;

public class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int sum = prices[0] + prices[1];
        if (sum <= money) {
            return money - sum;
        }
        return money;
    }
}
