package algorithms.leetcode.archive04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.cn/problems/combination-sum-ii/solutions/?company_slug=antgroup
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
//        int[] candidates = {1,7};
        int target = 8;
        List<List<Integer>> listList = solution.combinationSum2(candidates, target);
        System.out.println("listList.toString() = " + listList.toString());
    }

    List<List<Integer>> res = new ArrayList<>();
    int target;
    int[] candidates;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        this.target = target;
        this.candidates = candidates;
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        int index = 0;
        back(list, sum, index);
        return res;
    }

    private void back(List<Integer> list, int sum, int index) {
        if (sum == target) {
            if (!res.contains(list)) {
                res.add(new ArrayList<>(list));
            }
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (sum > target) {
                break;
            }
            sum += candidates[i];
            list.add(candidates[i]);
            index++;
            back(list, sum, index);
            sum -= list.get(list.size() - 1);
            list.remove(list.size() - 1);
        }
    }
}
