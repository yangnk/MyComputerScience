package dataStructureAndAlgorithms.leetcode.lc0401;

import java.util.Arrays;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-04-02 00:09
 **/
public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] newCost = Arrays.copyOf(cost, cost.length + 1);
        newCost[newCost.length - 1] = 0;
        if (cost.length <= 1) {
            return 0;
        }
        int[] sumCost = new int[newCost.length];
        sumCost[0] = 0;
        sumCost[1] = 0;
        for (int i = 2; i <= newCost.length - 1; i++) {
            sumCost[i] = Math.min(sumCost[i - 1] + newCost[i - 1], sumCost[i - 2] + newCost[i - 2]);
        }
        return sumCost[newCost.length - 1];
    }
//    public static void main(String[] args) {
//        int[] ints = {1, 2, 3};
//        int[] ints1 = Arrays.copyOf(ints, 4);
//        ints1[3] = 0;
//        System.out.println();
//    }
}
