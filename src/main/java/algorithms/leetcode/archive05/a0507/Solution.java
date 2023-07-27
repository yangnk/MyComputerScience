package algorithms.leetcode.archive05.a0507;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int[] ints = distinctDifferenceArray(new int[]{3, 2, 3, 4, 2});
        System.out.println(Arrays.toString(ints));
    }

    public static int[] distinctDifferenceArray(int[] nums) {

        if (nums == null || nums.length == 0) {
            return new int[]{};
        }

        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        int[] res = new int[nums.length];
        //初始化操作，将nums数组放到set2中
        for (Integer ele : nums) {
            if (!map2.containsKey(ele)) {
                map2.put(ele, 1);
            } else {
                map2.put(ele, map2.get(ele) + 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (!map1.containsKey(nums[i])) {
                map1.put(nums[i], 1);
            } else {
                map1.put(nums[i], map1.get(nums[i] + 1));
            }

            if (map2.get(nums[i]) == 1) {
                map2.remove(nums[i]);
            } else {
                map2.put(nums[i], map2.get(nums[i]) - 1);
            }
            int dif = map1.size() - map2.size();
            res[i] = dif;
        }
        return res;
    }
}
