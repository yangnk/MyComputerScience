//package dataStructureAndAlgorithms.leetcode.lc0623;
//
////
////
////实现 pow(x, n) ，即计算 x 的整数 n 次幂函数（即，xn ）。
////
////         
////
////        示例 1：
////
////        输入：x = 2.00000, n = 10
////        输出：1024.00000
////        示例 2：
////
////        输入：x = 2.10000, n = 3
////        输出：9.26100
////        示例 3：
////
////        输入：x = 2.00000, n = -2
////        输出：0.25000
////        解释：2-2 = 1/22 = 1/4 = 0.25
////
////        来源：力扣（LeetCode）
////        链接：https://leetcode.cn/problems/powx-n
////        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
//
//class Solution {
//    public double myPow(double x, int n) {
//        if (n == 0) {
//            if (x == 0) {
//                return 0;
//            }
//            return 1;
//        }else if (n > 0) {
//            return divide(x, 0, n - 1);
//        } else {
//            return 1 / divide(x, 0, -n - 1);
//        }
//    }
//
//    private double divide(double x, int left, int right) {
//        if (left == right) {
//            return x;
//        }
//        int mid = left + (right - left) / 2;
//        return merge(divide(x, left, mid), divide(x, mid + 1, right));
//    }
//
//    private double merge(double x, double y) {
//        return x * y;
//    }
//}