package dataStructureAndAlgorithms.leetcode.lc0616;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangningkai
 * @create 2022-06-16 22:36
 **/
class Solution4 {
    List<Integer> path = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backTrace(n, k, 1, 0);
        return result;
    }

    private void backTrace(int n, int k, int startIndex, int sum) {
//        剪枝
        if (sum > n) {
            return;
        }
//        退出条件:sum==n
        if (path.size() == k) {
            if (sum == n) {
                result.add(new ArrayList<>(path));
            }
            return;
        }
//        递归;
        for (int i = startIndex; i < 9 - (k - path.size()) + 1; i++) {
            sum += i;
            path.add(i);
            backTrace(n, k, i + 1, sum);
            path.remove(path.size() - 1);
            sum -= i;
        }
    }
}