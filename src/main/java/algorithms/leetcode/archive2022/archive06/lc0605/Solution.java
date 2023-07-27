package algorithms.leetcode.lc0605;

//6090. 极大极小游戏 显示英文描述
//        通过的用户数2223
//        尝试过的用户数2503
//        用户总通过次数2226
//        用户总提交次数2950
//        题目难度Easy
//        给你一个下标从 0 开始的整数数组 nums ，其长度是 2 的幂。
//
//        对 nums 执行下述算法：
//
//        设 n 等于 nums 的长度，如果 n == 1 ，终止 算法过程。否则，创建 一个新的整数数组 newNums ，新数组长度为 n / 2 ，下标从 0 开始。
//        对于满足 0 <= i < n / 2 的每个 偶数 下标 i ，将 newNums[i] 赋值 为 min(nums[2 * i], nums[2 * i + 1]) 。
//        对于满足 0 <= i < n / 2 的每个 奇数 下标 i ，将 newNums[i] 赋值 为 max(nums[2 * i], nums[2 * i + 1]) 。
//        用 newNums 替换 nums 。
//        从步骤 1 开始 重复 整个过程。
//        执行算法后，返回 nums 中剩下的那个数字。


class Solution {
    public int minMaxGame(int[] nums) {
        while (nums.length > 1) {
            int[] arr = new int[nums.length / 2];
            for (int j = 0; j < nums.length / 2; j++) {
                if (j % 2 == 0) {
                    arr[j] = Math.min(nums[2 * j], nums[2 * j + 1]);
                } else {
                    arr[j] = Math.max(nums[2 * j], nums[2 * j + 1]);
                }
            }
            nums = arr;
        }
        return nums[0];
    }
}