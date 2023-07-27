package dataStructureAndAlgorithms.leetcode.lc0513;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-05-13 22:52
 **/
public class Solution {
    List<List<Integer>> listList = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        combineTrace(n, k, 1);
        return listList;
    }

    private void combineTrace(int n, int k, int startIndex) {
        if (list.size() == k) {
            listList.add(new ArrayList<>(list));
            return;
        }
        for (int i = startIndex; i <= n - (k - list.size()) + 1; i++) {
            list.add(i);
            combineTrace(n, k, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
