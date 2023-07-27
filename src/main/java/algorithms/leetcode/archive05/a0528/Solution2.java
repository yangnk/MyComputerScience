//package algorithms.leetcode.archive05.a0528;
//
//import designPattern.creationalPattern.builder.BuilderTest;
//
//public class Solution2 {
//    public long minimumCost(String s) {
//        StringBuilder sb = new StringBuilder(s);
//        long ans = 0L;
//        int n = s.length();
//        int mid = (s.length() - 1) / 2;
//        char midChar = s.charAt(mid);
//        if (s.charAt(mid) != s.charAt(mid + 1)) {
//            ans += n - mid - 1;
//        }
//        //[0,mid-1]
//        for (int i = mid - 1; i >= 0; i--) {
//            if (s.charAt(i) != midChar) {
//                ans += i;
//                int i1 = ~(Integer.parseInt(s.substring(0, i), 2));
//                String s1 = Integer.toBinaryString(i1);
//                sb.replace(0, mid + 1, s1);
//            }
//        }
//        //[mid+2,n-1]
//
//    }
//}
