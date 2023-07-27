package algorithms.leetcode.archive2022.archive09.lc0903;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backTrack(nums, nums.length, 0);
        return res;
    }

    private void backTrack(int[] nums, int len, int begin) {
        if (begin == len) {
            if (!res.contains(path)) {
                res.add(new ArrayList<>(path));
            }
            return;
        }

        backTrack(nums, len, begin + 1);
        path.add(nums[begin]);
        backTrack(nums, len, begin + 1);
        path.remove(path.size() - 1);
    }
}
