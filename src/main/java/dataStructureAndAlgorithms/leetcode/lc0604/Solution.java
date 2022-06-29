package dataStructureAndAlgorithms.leetcode.lc0604;

import java.util.*;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-06-04 17:40
 **/
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        //统计次数
        Map<Integer, Integer> map = new HashMap<>();
        for (int item : arr) {
            if (!map.containsKey(item)) {
                map.put(item, 1);
                continue;
            }
            map.put(item, map.get(item) + 1);
        }
        //次数去重
        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> item : map.entrySet()) {
            set.add(item.getValue());
        }

        return set.size() == map.size();
    }
}