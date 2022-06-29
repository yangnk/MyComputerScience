package dataStructureAndAlgorithms.leetcode.lc0616;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangningkai
 * @create 2022-06-16 21:48
 **/

public class Solution3 {
    List<Integer> path = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        combine(n, k, 1);
        return result;
    }

    private void combine(int n, int k, int startIndex) {
        //终止条件中进行处理
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        //递归
        for (int j = startIndex; j <= n - (k - path.size()) + 1; j++) {
            path.add(j);
            combine(n, k, j + 1);
            path.remove(path.size() - 1);
        }
    }
}
