package algorithms.leetcode.archive2022.archive09.lc0920;

public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int maxProfit = solution1.maxProfit(new int[]{1, 2, 3, 4, 5});
        System.out.println("maxProfit = " + maxProfit);
    }

    public int maxProfit(int[] prices) {
        int min = 0;
        int max = 0;
        int trend = 0;//1-递增；-1-递减；
        int flag = 0;
        int ret = 0;
        for (int i = 0; i <= prices.length - 2; i++) {
            if (prices[i] < prices[i + 1] && (trend == -1 || trend == 0)) {
                min = prices[i];
                trend = 1;
                flag++;
            }
            if (prices[i] > prices[i + 1] && (trend == 1 || trend == 0) && flag == 1) {
                max = prices[i];
                trend = -1;
                flag++;
            }
            if (flag == 2) {
                ret += max - min;
                flag = 0;
            }
            if (i == prices.length - 2 && flag == 1) {
                ret += prices[prices.length - 1] - min;
            }
        }
        return ret;
    }
}
