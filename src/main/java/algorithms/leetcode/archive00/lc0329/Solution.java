package dataStructureAndAlgorithms.leetcode.lc0329;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-03-29 00:00
 **/
class Solution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

//    public int fib(int n) {
//        int[] arr = new int[n + 1];
//        if (n <= 1) {
//            System.out.println(n + ": " + arr[n]);
//            System.out.println("=================");
//            return n;
//        }
//        arr[0] = 0;
//        arr[1] = 1;
//        for (int i = 2; i <= n; i++) {
//            arr[i] = arr[i - 1] + arr[i - 2];
//            System.out.println(i + ": " + arr[i]);
//        }
//        return arr[n];
//    }
}