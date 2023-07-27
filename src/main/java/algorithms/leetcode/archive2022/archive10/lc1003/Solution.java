package algorithms.leetcode.archive2022.archive10.lc1003;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean res = solution.equalFrequency("bac");

        System.out.println("res = " + res);

    }

    public boolean equalFrequency(String word) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (frequencyMap.containsKey(chars[i])) {
                frequencyMap.put(chars[i], frequencyMap.get(chars[i]) + 1);
            } else {
                frequencyMap.put(chars[i], 1);
            }
        }

        List<Integer> valueList = new ArrayList(frequencyMap.values());
        TreeSet<Integer> valueSet = new TreeSet<>(frequencyMap.values());

        Collections.sort(valueList);

        if (valueSet.size() == 1 || (valueSet.size() == 2 && Math.abs(valueSet.first() - valueSet.last()) == 1)) {
            if (valueList.size() == 1) {
                return true;
            } else if ((valueSet.size() == 1 && valueList.get(0) == 1) ||
                    (valueSet.size() == 2 && valueList.get(0) == 1 && valueList.get(1) - valueList.get(0) != 0)) {
                return true;
            } else if (valueList.get(valueList.size() - 1) - valueList.get(valueList.size() - 2) == 1) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
