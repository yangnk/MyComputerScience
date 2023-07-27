package algorithms.leetcode.archive05.a0528;

public class Solution {
    public static void main(String[] args) {
        String s = removeTrailingZeros("51230100");
        System.out.println("s = " + s);
    }

    public static String removeTrailingZeros(String num) {
        int lastIndex = num.length() - 1;
        int stopIndex = 0;
        for (int i = lastIndex; i >= 0; i--) {
            if (num.charAt(i) == '0') {
                continue;
            }
            stopIndex = i;
            break;
        }
        String res = num.substring(0, stopIndex + 1);
        return res;
    }
}
