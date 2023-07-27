package algorithms.leetcode.archive2022.archive10.lc1011;

import java.util.HashSet;
import java.util.Set;

public class Solution {


    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean happy = solution.isHappy(2);
        System.out.println("happy = " + happy);
    }

    public boolean isHappy(int n) {
        Set<Integer> numSet = new HashSet<>();
        numSet.add(n);

        while (true) {
            String str = String.valueOf(n);
            char[] chars = str.toCharArray();
            int sum = 0;
            for (int i = 0; i < chars.length; i++) {
                sum += (chars[i] - '0') * (chars[i] - '0');
            }
            double log10 = Math.log10(sum);
            if (log10 - Math.floor(log10) < Math.pow(10, -6)) {
                return true;
            }
            if (numSet.contains(sum)) {
                return false;
            }
            numSet.add(sum);
            n = sum;
        }
    }
}
