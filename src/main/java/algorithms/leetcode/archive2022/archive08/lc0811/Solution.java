package algorithms.leetcode.archive2022.archive08.lc0811;

import java.util.ArrayList;

//https://leetcode.cn/problems/maximum-number-of-consecutive-values-you-can-make/

public class Solution {
    public int getMaximumConsecutive(int[] coins) {
        int result = 1;
        while (true) {
            if (isExist(coins, result) == true) {
                continue;
            }
            break;
        }
        return result;
    }

    public boolean isExist(int[] coins, int sum) {
        return backTrace(coins, sum, 0, 0, new ArrayList<Integer>());
    }

    private boolean backTrace(int[] coins, int sum, int curSum, int beginIndex, ArrayList<Integer> result) {
        if (curSum == sum) {
            return true;
        }
        if (beginIndex >= coins.length) {//todo
            return false;
        }
        result.add(beginIndex + 1);
        curSum += coins[beginIndex + 1];
        boolean ans = backTrace(coins, sum, curSum, beginIndex + 1, result);
        if (ans == true) {
            return true;
        }
        curSum -= coins[beginIndex + 1];
        result.remove(result.size() - 1);
        return false;
    }
}
