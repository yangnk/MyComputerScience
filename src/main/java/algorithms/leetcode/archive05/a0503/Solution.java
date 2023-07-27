package algorithms.leetcode.archive05.a0503;

import java.util.ArrayList;
import java.util.List;

public class Solution {


    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backTrace(n, k, new ArrayList<Integer>(), 0);
        return res;
    }

    private void backTrace(int n, int k, ArrayList<Integer> list, int index) {
        if (list.size() == k) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i <= n - k + list.size(); i++) {
            list.add(i + 1);
            i += 1;
            backTrace(n, k, list, i);
            i -= 1;
            list.remove(list.size() - 1);
        }
    }
}
