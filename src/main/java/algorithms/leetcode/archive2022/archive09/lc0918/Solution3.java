package algorithms.leetcode.archive2022.archive09.lc0918;

import java.util.Arrays;

public class Solution3 {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        int[] ints = solution3.smallestSubarrays(new int[]{1, 0, 2, 1, 3});
        System.out.println("ints = " + Arrays.toString(ints));

    }

    public int[] smallestSubarrays(int[] nums) {
        int[] valArr  = new int[nums.length];
        int[] ret = new int[nums.length];

        int ans = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans |= nums[i];
            valArr[i] = ans;
        }

        for (int i = 0; i < nums.length; i++) {
            int[] ints = Arrays.copyOfRange(nums, i, nums.length);
            int b = getAns(ints, valArr[i]);
            ret[i] = b + 1;
        }
        return ret;
    }

    private int getAns(int[] ints, int val) {
        int ans = 0;
        for (int j = 0; j < ints.length; j++) {
            ans |= ints[j];
            if (ans == val) {
                return j;
            }
        }
        return 0;
    }
}
