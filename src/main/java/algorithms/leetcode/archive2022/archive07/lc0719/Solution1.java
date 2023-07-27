package algorithms.leetcode.archive2022.archive07.lc0719;


public class Solution1 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param nums int整型一维数组
     * @return int整型
     */
    public int findPeakElement (int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            int pre = (i == 0 ? Integer.MIN_VALUE : nums[i - 1]);
            int next = (i == nums.length - 1 ? Integer.MIN_VALUE : nums[i + 1]);
            if (cur > pre && cur > next) {
                return i;
            }
        }
        return -1;
    }
}