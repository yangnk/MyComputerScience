package dataStructureAndAlgorithms.leetcode.others;

import java.util.Arrays;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-01-22 23:35
 **/
public class DynamicProgrammingOrGreedy0122 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int[] ints = Arrays.copyOfRange(prices, i, prices.length);
            int fixedMaxProfit = getFixedMaxProfit(ints);
            if (fixedMaxProfit > maxProfit) {
                maxProfit = fixedMaxProfit;
            }
        }
        return maxProfit;
    }

    public int getFixedMaxProfit(int[] fixedPrices) {
        int maxValues = Arrays.stream(fixedPrices).max().getAsInt();
        if (maxValues > fixedPrices[0]) {
            return maxValues - fixedPrices[0];
        }
        return 0;
    }

    public int maxProfit1(int[] prices) {
        int result = 0;
        int pre = 0;
        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i - 1];
            pre = Math.max(pre + diff, 0);
            result = Math.max(result, pre);
        }
        return result;
    }
}
