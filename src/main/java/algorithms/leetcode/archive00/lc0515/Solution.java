package dataStructureAndAlgorithms.leetcode.lc0515;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-05-15 23:19
 **/
public class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        combinationTrace(n, k, 1, 0);
        return result;
    }

    private void combinationTrace(int targetSum, int k, int startIndex, int sum) {
        //剪枝
        if (sum > targetSum) {
            return;
        }
        //终止条件
        if (path.size() == k) {
            if (sum == targetSum) {
                result.add(new ArrayList<>(path));
            }
            return;
        }
        for (int i = startIndex; i <= 10 - k + path.size(); i++) {
            path.add(i);
            sum += i;
            combinationTrace(targetSum, k, i + 1, sum);
            path.remove(path.size() - 1);
            sum -= i;
        }
    }
}
