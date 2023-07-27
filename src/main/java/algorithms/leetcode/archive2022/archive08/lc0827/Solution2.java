package algorithms.leetcode.archive2022.archive08.lc0827;

public class Solution2 {
    //遍历数组，其中有一个能调到某位即可
//    public boolean canJump(int[] nums) {
//        int k = 0;
//        for (int i = 0; i <= k; i++) {
//            k = Math.max(k, i + nums[i]);
//            if (k >= nums.length - 1) {
//                return true;
//            }
//        }
//        return false;
//    }

    public boolean canJump(int[] nums) {
        //farthest是到当前元素所能跳到的最远距离
        int farthest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (farthest >= i) {
                farthest = Math.max(farthest, i + nums[i]);
                if (farthest >= nums.length - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
