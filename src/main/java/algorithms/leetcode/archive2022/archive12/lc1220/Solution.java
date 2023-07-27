package algorithms.leetcode.archive2022.archive12.lc1220;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.combinationSum(new int[]{2, 3, 6, 7}, 7);
    }



    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resList = new ArrayList<>();
        backTrack(candidates, target, resList, 0, new ArrayList<>());
        return resList;
    }

    /**
     *
     * @param candidates
     * @param target
     * @param resList
     * @param index
     * @param list
     */
    private void backTrack(int[] candidates, int target, List<List<Integer>> resList, int index, List<Integer> list) {

        if (target == 0) {
            resList.add(new ArrayList<>(list));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            list.add(candidates[i]);
            backTrack(candidates, target - candidates[i], resList, i, list);
            list.remove(list.size() - 1);
        }
    }
}
