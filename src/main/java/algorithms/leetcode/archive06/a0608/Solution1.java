package algorithms.leetcode.archive06.a0608;
//
//
//给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
//
//
//
//        示例 1：
//
//
//
//        输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
//        输出：6
//        解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。


public class Solution1 {
    //时间复杂度:O(n)
    //空间复杂度:O(n)

    public int trap(int[] height) {


        int[] preMax = new int[height.length];
        int[] sufMax = new int[height.length];

        int curPreMax = -1;
        for (int i = 0; i < height.length; i++) {
            curPreMax = Math.max(curPreMax, height[i]);
            preMax[i] = curPreMax;
        }

        int curSufMax = -1;
        for (int i = height.length - 1; i >= 0; i--) {
            curSufMax = Math.max(curSufMax, height[i]);
            sufMax[i] = curSufMax;
        }

        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            ans += Math.min(preMax[i], sufMax[i]) - height[i];
        }
        return ans;
    }
}
