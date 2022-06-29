//package dataStructureAndAlgorithms.leetcode.lc0623;
//
///**
// * @author yangningkai
// * @create 2022-06-23 15:56
// **/
//
//class Solution3a {
//    public double myPow(double x, int n) {
//        if (n > 0) {
//            return divide(x, n);
//        } else {
//            return 1 / divide(x, -n);
//        }
//    }
//
//    private double divide(double x, int n) {
//        if (n == 0) {
//            return 1;
//        }
//        double y = divide(x, n / 2);
//        return n % 2 == 0 ? y * y : y * y * x;
//    }
//}