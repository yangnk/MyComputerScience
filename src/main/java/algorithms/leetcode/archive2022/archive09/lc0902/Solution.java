package algorithms.leetcode.archive2022.archive09.lc0902;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backTrack(nums, 0);
        return ans;
    }

    private void backTrack(int[] nums, int begin) {
        if (begin == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        backTrack(nums, begin + 1);
        list.add(nums[begin]);
        backTrack(nums, begin + 1);
        list.remove(list.size() - 1);
    }


//    List<List<Integer>> ans = new ArrayList<>();
//    List<Integer> list = new ArrayList<>();
//    public List<List<Integer>> subsets(int[] nums) {
//        backTrack(0, nums);
//        return ans;
//    }
//
//    private void backTrack(int cur, int[] nums) {
//        if (cur == nums.length) {
//            ans.add(new ArrayList<>(list));
//            return;
//        }
//        list.add(nums[cur]);
//        backTrack(cur + 1, nums);
//        list.remove(list.size() - 1);
//        backTrack(cur + 1, nums);
//    }


//    public List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> ans = new ArrayList<>();
//        int len = nums.length;
//        for (int mask = 0; mask < (1 << len); mask++) {
//            List<Integer> list = new ArrayList<>();
//            for (int i = 0; i < len; i++) {
//                if ((mask & (1 << i)) != 0) {
//                    list.add(nums[i]);
//                }
//            }
//            ans.add(list);
//        }
//        return ans;
//    }
}
