package algorithms.leetcode.lc0616;


//1213. 三个有序数组的交集
//        给出三个均为 严格递增排列 的整数数组 arr1，arr2 和 arr3。返回一个由 仅 在这三个数组中 同时出现 的整数所构成的有序数组。


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution2 {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        //arr1放到set1中，set1和arr2比较，筛选出相同的放到set2中，set2和arr3比较，筛选的放到set3中，set3即为结果
        Set<Integer> set1 = new HashSet<>();
        for (Integer item : arr1) {
            set1.add(item);
        }
        Set<Integer> set2 = new HashSet<>();
        for (Integer item : arr2) {
            if (set1.contains(item)) {
                set2.add(item);
            }
        }

        List<Integer> list = new ArrayList<>();
        for (Integer item : arr3) {
            if (set2.contains(item)) {
                list.add(item);
            }
        }
        return list;
    }
}