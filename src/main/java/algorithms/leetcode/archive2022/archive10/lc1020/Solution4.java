package algorithms.leetcode.archive2022.archive10.lc1020;

public class Solution4 {

    public static void main(String[] args) {
//        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        Solution4 solution4 = new Solution4();
        solution4.isPowerOfThree(2147483647);
    }


    public boolean isPowerOfThree(int n) {
        if (n == 1) {
            return true;
        }

        Long sum = 1L;
        while (true) {
            sum *= 3;
            if (sum == n) {
                return true;
            } else if (sum > n) {
                return false;
            } else {
                continue;
            }
        }
    }
}
