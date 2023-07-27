package algorithms.leetcode.archive2022.archive08.lc0811;

import java.util.Arrays;

public class Solution_a {
    public int getMaximumConsecutive(int[] coins) {
        Arrays.sort(coins);
        int result = 0;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= result + 1) {
                result += coins[i];
            } else {
                break;
            }
        }
        return result + 1;
    }
}
