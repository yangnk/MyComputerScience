package algorithms.leetcode.archive01.a0126;
//https://leetcode.cn/contest/weekly-contest-319/problems/number-of-subarrays-with-lcm-equal-to-k/ -->未做出来

public class Solution1 {

    public static void main(String[] args) {
        int[] nums = {2,1,1,5};
        int k = 5;

        int lcm = subarrayLCM(nums, k);
        System.out.println("lcm = " + lcm);
    }

    public static int subarrayLCM(int[] nums, int k) {
        int[] dp = new int[nums.length];
        dp[0] = (nums[0] == k ? 1 : 0);
        if (nums.length == 1) {
            return dp[0];
        }

        if (dp[0] == 0 && k % nums[1] != 0) {
            dp[1] = 0;
        } else if ((nums[0] == k && k % nums[1] != 0) || (nums[1] == k && k % nums[0] != 0)) {
            dp[1] = 1;
        } else if (dp[0] == 0 && nums[1] == k && k % nums[0] == 0) {
            dp[1] = 2;
        } else {
            dp[1] = 3;
        }

        for (int i = 2; i < nums.length; i++) {
            if (k % nums[i] != 0||(dp[i - 1] == dp[i - 2] && nums[i] != k)) {
                dp[i] = dp[i - 1];
            } else if (dp[i - 1] == dp[i - 2] && nums[i] == k) {
                dp[i] = dp[i - 1] + 1;
            } else if (dp[i - 1] != dp[i - 2] && nums[i] == k) {
                dp[i] = 2 * dp[i - 1] - dp[i - 2] + 1;
            } else if (dp[i - 1] != dp[i - 2] && k % nums[i] == 0) {
                dp[i] = 2 * dp[i - 1] - dp[i - 2];
            }
        }
        return dp[nums.length - 1];
    }
}
