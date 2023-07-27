package algorithms.leetcode.archive04.a0426;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution1 {


    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        List<List<Integer>> listList = solution1.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        System.out.println("listList = " + listList);

    }

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> fourSum(int[] nums, int target) {
        backTrace(nums, target, new ArrayList<Integer>(), 0, 0);
        return res;
    }

    void backTrace(int[] nums, int target, List<Integer> list, int sum, int index) {

        if (list.size() == 4) {
            if (sum == target) {
                ArrayList<Integer> sortedList = new ArrayList<>(list);
                Collections.sort(sortedList);
                if (!res.contains(sortedList)) {
                    res.add(sortedList);
                }
                return;
            } else {
                return;
            }
        }

        for (int i = index; i <= nums.length + list.size() - 4; i++) {
            sum += nums[i];
            list.add(nums[i]);
            backTrace(nums, target, list, sum, i + 1);
            list.remove(list.size() - 1);
            sum -= nums[i];
        }
    }
}