package algorithms.leetcode.archive2022.archive09.lc0908;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] constructArray(int n, int k) {
        List<Integer> list = new ArrayList<>();
        int start = 1;
        int end = start + k;
        int next = end + 1;
        list.add(start);
        list.add(end);

        while (end - start > 1) {
            if (end - start > 1) {
                start ++;
                list.add(start);
            }
            if (end - start > 1) {
                end -= 1;
                list.add(end);
            }
        }
        for (int i = next; i <= n; i++) {
            list.add(i);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
