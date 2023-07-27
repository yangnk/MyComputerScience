package algorithms.leetcode.lc0617;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangningkai
 * @create 2022-06-17 10:17
 **/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            //第一层
            if (i == 1) {
                List<Integer> list = new ArrayList<>();
                list.add(1);
                result.add(list);
            } else {
                //一层之外层
                List<Integer> list = new ArrayList<>();
                for (int j = 0; j < i; j++) {
                    if (j == 0 || j == i - 1) {
                        list.add(1);
                    } else {
                        list.add(result.get(i - 2).get(j - 1) + result.get(i - 2).get(j));
                    }
                }
                result.add(list);
            }
        }
        return result;
    }
}