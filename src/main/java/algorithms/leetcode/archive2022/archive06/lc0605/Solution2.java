package algorithms.leetcode.lc0605;

//
//给你一个整数数组 nums 和一个整数 k 。你可以将 nums 划分成一个或多个 子序列 ，使 nums 中的每个元素都 恰好 出现在一个子序列中。
//
//        在满足每个子序列中最大值和最小值之间的差值最多为 k 的前提下，返回需要划分的 最少 子序列数目。
//
//        子序列 本质是一个序列，可以通过删除另一个序列中的某些元素（或者不删除）但不改变剩下元素的顺序得到。


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2 {

    public static void main(String[] args) {
        int[] nums = {3, 6, 1, 2, 5};
        System.out.println(partitionArray(nums, 2));
    }


    public static int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        List<List<Integer>> listList = new ArrayList<>();
        //初始化
        List<Integer> list0 = new ArrayList<>();
        list0.add(nums[0]);
        listList.add(list0);

        //循环分配到子序列
        for (int i = 1; i < nums.length; i++) {
            int item = nums[i];
            //获取listlist最后一个list元素
            List<Integer> list = listList.get(listList.size() - 1);
            System.out.printf("list.get(0).intValue():%d\n", list.get(0).intValue());
            int diff = item - list.get(0).intValue();

            if (diff <= k) {
                listList.remove(listList.size() - 1);
                list.add(item);
                listList.add(list);
            } else {
                List<Integer> list1 = new ArrayList<>();
                list1.add(item);
                listList.add(list1);
            }

        }
        return listList.size();
    }
}