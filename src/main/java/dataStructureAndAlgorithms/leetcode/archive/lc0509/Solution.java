package dataStructureAndAlgorithms.leetcode.lc0509;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-05-09 22:56
 **/
class Solution {
    //动态规划
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int[] result = new int[n + 1];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i <= n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n];
    }

    //递归
    public int fib1(int n) {
        if (n <= 1) {
            return n;
        }
        return fib1(n - 1) + fib1(n - 2);
    }
}