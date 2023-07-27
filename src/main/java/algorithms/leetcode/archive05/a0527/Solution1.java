package algorithms.leetcode.archive05.a0527;

import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Solution1 {

    int maxIndex = Integer.MIN_VALUE;
    int minExtraSum = Integer.MAX_VALUE;
    public int minExtraChar(String s, String[] dictionary) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (String item : dictionary) {
            int firstIndex;
            if ((firstIndex = s.indexOf(item)) != -1) {
                int lastIndex = firstIndex + item.length() - 1;
                treeMap.put(firstIndex, lastIndex);
                if (lastIndex > maxIndex) {
                    maxIndex = lastIndex;
                }

            }
        }

        backTrace(treeMap, s, 0, new TreeMap<>(), 0);
        return minExtraSum;
    }

    void backTrace(TreeMap<Integer, Integer> treeMap, String s, Integer index,
                   TreeMap<Integer, Integer> ans,int extraSum) {

        //跳出条件
        int lastIndex = ans.lastEntry().getKey() + ans.lastEntry().getValue();
        if (lastIndex == s.length() - 1 || lastIndex >= maxIndex) {
            //extraSum++
            extraSum += s.length() - lastIndex;
            if (extraSum < minExtraSum) {
                minExtraSum = extraSum;
            }
            return;
        }

        TreeMap<Integer, Integer> filterMap = treeMap.entrySet().stream()
                .filter(integerIntegerEntry -> integerIntegerEntry.getKey() > lastIndex)
                .collect(TreeMap::new, (map, entry) -> map.put(entry.getKey(), entry.getValue()), TreeMap::putAll);

        for (Map.Entry<Integer,Integer> entry : filterMap.entrySet()) {
            ans.put(entry.getKey(), entry.getValue());
            extraSum += entry.getKey() - ans.lastEntry().getValue();
            backTrace(treeMap, s, entry.getKey(), ans, extraSum);
            ans.remove(entry.getKey());
            extraSum--;
        }
    }
}
