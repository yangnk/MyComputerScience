//package dataStructureAndAlgorithms.leetcode.lc0612;
//
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
////如果有超过平均值的，那超过平均值最大的即为公平值
////如果没有超过平均值，就开始平凑
//class Solution2 {
//    public int distributeCookies(int[] cookies, int k) {
//        int sum = Arrays.stream(cookies).sum();
//        Arrays.sort(cookies);
//        double avg = ((double) sum) / cookies.length;
//
//        if (avg < cookies[cookies.length - 1]) {
//            return cookies[cookies.length - 1];
//        }
//
//    }
//}