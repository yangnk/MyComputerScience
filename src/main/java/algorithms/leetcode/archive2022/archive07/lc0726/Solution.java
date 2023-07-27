package algorithms.leetcode.archive2022.archive07.lc0726;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> result = solution.combinationSum3(3, 9);
        System.out.println(result.toString());
    }

    List<List<Integer>> listList = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backTrack(k, n, new ArrayList<Integer>(), 1);
        return listList;
    }

    private void backTrack(int k, int n, ArrayList<Integer> list, int startIndex) {
        if (list.size() == k) {
            if (list.stream().mapToInt(Integer::intValue).sum() == n) {
                listList.add(new ArrayList<>(list));
            }
            return;
        }
        for (int i = startIndex; i <= 9 - (k - list.size()) + 1; i++) {
            if (list.contains(i)) {
                return;
            }
            list.add(i);
            backTrack(k, n, list, startIndex + 1);
            list.remove(list.size() - 1);
        }
    }
}
