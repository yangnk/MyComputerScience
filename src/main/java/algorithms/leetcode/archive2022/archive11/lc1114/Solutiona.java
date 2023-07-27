package algorithms.leetcode.archive2022.archive11.lc1114;

class Solutiona {

    public static void main(String[] args) {
        Solutiona a = new Solutiona();
        int maxProfit = a.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        System.out.println("maxProfit = " + maxProfit);
    }


    //一直遍历prices数组，小于原最低价格的则替代，和原最低价格之差大于原最大收益则替代
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}