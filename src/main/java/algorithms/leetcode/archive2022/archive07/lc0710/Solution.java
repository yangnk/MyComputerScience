package algorithms.leetcode.archive2022.archive07.lc0710;

import java.util.Arrays;

/**
 * @author yangningkai
 * @create 2022-07-10 11:20
 **/

public class Solution {
    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        int result = 0;
        while (amount[1] != 0 && amount[2] != 0) {
            amount[1]--;
            amount[2]--;
            result++;
            Arrays.sort(amount);
        }
        return result + amount[2];
    }
}
