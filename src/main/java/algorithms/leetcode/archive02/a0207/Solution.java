package algorithms.leetcode.archive02.a0207;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int item : nums) {
            numSet.add(item);
        }

        int maxStep = 0;
        for (int item : numSet) {
            if (!numSet.contains(item - 1)) {
                int curNum = item;
                int curStep = 1;
                while (numSet.contains(curNum + 1)) {
                    curStep++;
                    curNum++;
                }
                maxStep = Math.max(maxStep, curStep);
            }

        }

        return maxStep;
    }
}
