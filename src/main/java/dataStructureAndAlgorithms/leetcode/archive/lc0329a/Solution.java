package dataStructureAndAlgorithms.leetcode.lc0329a;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-03-29 23:22
 **/
class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] ints = new int[n + 1];
        ints[1] = 1;
        ints[2] = 2;
        for (int i = 3; i <= n; i++) {
            ints[i] = ints[i - 1] + ints[i - 2];
        }
        return ints[n];
    }
}
