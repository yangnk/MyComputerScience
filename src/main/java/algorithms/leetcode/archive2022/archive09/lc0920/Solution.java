package algorithms.leetcode.archive2022.archive09.lc0920;

import java.util.ArrayList;
import java.util.List;

//["2", "4->49", "51->74", "76->99"]
public class Solution {

    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> ret = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            if (upper - lower != 0) {
                ret.add(String.valueOf(lower) + "->" + String.valueOf(upper));
            } else {
                ret.add(String.valueOf(lower));
            }
            return ret;
        }
        //头
        if (nums[0] - lower == 1) {
            ret.add(String.valueOf(lower));
        }
        if (nums[0] - lower > 1) {
            ret.add(String.valueOf(lower) + "->" + String.valueOf(nums[0] - 1));
        }
        //中间
        for (int i = 0; i < nums.length - 1; i++) {//
            if (nums[i + 1] - nums[i] == 2) {
                ret.add(String.valueOf(nums[i] + 1));
            }
            if (nums[i + 1] - nums[i] > 2) {
                ret.add(String.valueOf(nums[i] + 1) + "->" + String.valueOf(nums[i + 1] - 1));
            }
        }
        //尾
        if (upper - nums[nums.length - 1] == 1) {
            ret.add(String.valueOf(upper));
        }
        if (upper - nums[nums.length - 1] > 1) {
            ret.add(String.valueOf(nums[nums.length - 1] + 1) + "->" + String.valueOf(upper));
        }
        return ret;
    }
}
