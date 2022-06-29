package dataStructureAndAlgorithms.leetcode.lc0516;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-05-16 19:20
 **/
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        permuteTrace(nums);
        return result;
    }

    private void permuteTrace(int[] nums) {
        //退出条件
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            //处理
            if (path.contains(nums[i])) {
                continue;
            }
            path.add(nums[i]);
            permuteTrace(nums);
            path.remove(path.size() - 1);
        }
    }
}