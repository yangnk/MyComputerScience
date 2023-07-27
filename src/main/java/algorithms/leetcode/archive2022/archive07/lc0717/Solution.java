package algorithms.leetcode.archive2022.archive07.lc0717;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        int[] a = {1, 3, 2, 1, 3, 2, 2};
        int[] ints = numberOfPairs(a);
        System.out.println(Arrays.toString(ints));

    }
    public static int[] numberOfPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        int pairNum = 0;
        int leftNum = 0;
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next().getValue();
            pairNum += value / 2;
            leftNum += value % 2;
        }

        result[0] = pairNum;
        result[1] = leftNum;
        return result;
    }
}
