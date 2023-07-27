package algorithms.leetcode.lc0616;

//
//1431. 拥有最多糖果的孩子
//        给你一个数组 candies 和一个整数 extraCandies ，其中 candies[i] 代表第 i 个孩子拥有的糖果数目。
//
//        对每一个孩子，检查是否存在一种方案，将额外的 extraCandies 个糖果分配给孩子们之后，此孩子有 最多 的糖果。注意，允许有多个孩子同时拥有 最多 的糖果数目。


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //先找到candies数组中的最大值，再遍历比较candies+extraCandies是否超过最大值，注意遍历元素是否为最大值
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> list = new ArrayList<>();

        for (int item : candies) {
            if (item == max) {
                list.add(true);
            } else {
                if (item + extraCandies >= max) {
                    list.add(true);
                } else {
                    list.add(false);
                }
            }

        }
        return list;
    }
}