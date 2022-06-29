package dataStructureAndAlgorithms.leetcode.others;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().JumpFloorII(1));
    }

    public int JumpFloorII(int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        dp[1] = 1;
        if(target >= 3){
            for(int i = 3; i <= target + 1; i++){
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[target];
    }
}