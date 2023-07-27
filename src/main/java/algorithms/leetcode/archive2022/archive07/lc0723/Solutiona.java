package algorithms.leetcode.archive2022.archive07.lc0723;

import java.util.*;

public class Solutiona {
    List<List<Integer>> listlist = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        backTrace(nums, list);
        return listlist;
    }

    private void backTrace(int[] num, ArrayList<Integer> list) {
        if (num.length == list.size()) {
            listlist.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < num.length; i++) {
            if (list.contains(num[i])) continue;
            list.add(num[i]);
            backTrace(num, list);
            list.remove(list.size() - 1);
        }
    }
}