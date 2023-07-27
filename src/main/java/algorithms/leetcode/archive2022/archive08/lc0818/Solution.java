package algorithms.leetcode.archive2022.archive08.lc0818;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        getParenthsis("", n, n);
        return result;
    }

    private void getParenthsis(String s, int left, int right) {
        if (left == 0 && right == 0) {
            result.add(s);
            return;
        }
        if (left == right) {
            getParenthsis(s + "(", left - 1, right);
        } else if (left < right) {
            if (left > 0) {
                getParenthsis(s + "(", left - 1, right);
            }
            getParenthsis(s + ")", left, right - 1);
        }
    }
}