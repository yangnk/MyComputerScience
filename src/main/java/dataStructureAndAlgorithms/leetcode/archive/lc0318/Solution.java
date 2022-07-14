package dataStructureAndAlgorithms.leetcode.lc0318;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-03-18 11:05
 **/
class Solution {
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }

    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;

        }
        if (n == 2) {
            return 2;

        }
        return climbStairs(n - 1) + climbStairs(n - 2);


//        int[] count = new int[n + 1];
//        if (n == 1) {
//            return 1;
//        }
//        if (n == 2) {
//            return 2;
//        }
//        count[1] = 1;
//        count[2] = 2;
//        for (int i = 3; i <= n; i++) {
//            count[i] = count[i - 1] + count[i - 2];
//        }
//        return count[n];
    }
}