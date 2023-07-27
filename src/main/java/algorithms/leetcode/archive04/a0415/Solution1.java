package algorithms.leetcode.archive04.a0415;
//
//定义一个数组 arr 的 转换数组 conver 为：
//
//        conver[i] = arr[i] + max(arr[0..i])，其中 max(arr[0..i]) 是满足 0 <= j <= i 的所有 arr[j] 中的最大值。
//        定义一个数组 arr 的 分数 为 arr 转换数组中所有元素的和。
//
//        给你一个下标从 0 开始长度为 n 的整数数组 nums ，请你返回一个长度为 n 的数组 ans ，其中 ans[i]是前缀 nums[0..i] 的分数。
//


import java.util.Arrays;

public class Solution1 {

    public static void main(String[] args) {
        long[] prefixScore = findPrefixScore(new int[]{137381902, 583670185, 232449799, 615240518, 692364261, 339595728, 193558230, 477734537, 408666227, 180093966, 73374595, 401827223, 544402033, 460199809, 967906902, 609720313, 20713685, 466223557, 187038791, 821463819, 44138353, 62610391, 286485490, 475645586, 570010342, 772864005, 789886761, 582447818, 449215930, 79498550, 880611913, 498198623, 98223903, 297927296, 929528075, 151612343, 718714067, 441682283, 950308227, 509793041, 310411982, 271303282, 402560714, 831564217, 492421656, 775074730, 462574919, 266050840, 411725032, 692603442, 88005551, 129970833, 314440283, 513936108, 97431418, 1824470, 655637394, 970780627, 611143448, 77750843});
        System.out.println();

    }

    public static long[] findPrefixScore(int[] nums) {
        long[] res = new long[nums.length];
        long[] ans = new long[nums.length];
        int maxIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            if (maxIndex == -1) {
                maxIndex = i;
                ans[i] = nums[i] + nums[maxIndex];
                res[i] = ans[i];
                continue;
            }
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
            ans[i] = nums[i] + nums[maxIndex];
            res[i] = res[i - 1] + ans[i];
        }
        return res;
    }
}
