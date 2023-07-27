package algorithms.leetcode.archive2022.archive12;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int bits = solution.reverseBits(43261596);
        System.out.println("bits = " + bits);
    }

    // you need treat n as an unsigned value
    public int reverseBits(int n) {

        //判断[i]位是否为1，是的话则相加
        int ans = 0;
        for (int i = 0; i <= 31; i++) {
            int f = (n >> i) & 1;
            if (f == 1) {
                ans |= (1 << (i - 31));
            }
        }
        return ans;


//        String s = "";
//        for (int i = 0; i <= 31; i++) {
//            s += (n & (i << 1)) == 0 ? "0" : "1";
//        }
//
//        int ans = 0;
//
//        ans = Integer.parseUnsignedInt(s, 2);
//
////        for (int i = 31; i >= 0; i--) {
////            char c = s.charAt(i);
////            if (c == '1') {
////                ans += Math.pow(2, 31 - i);
////            }
////        }
//        return ans;
    }
}
