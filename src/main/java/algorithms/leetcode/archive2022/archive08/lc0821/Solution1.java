package algorithms.leetcode.archive2022.archive08.lc0821;

import java.util.*;

public class Solution1 {
    public String largestPalindromic(String num) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length(); i++) {
            String key = num.substring(i, i + 1);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        Map<String, Integer> evenMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.valueOf(o2) - Integer.valueOf(o1);
            }
        });
        Map<String, Integer> oddMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.valueOf(o2) - Integer.valueOf(o1);
            }
        });
        for (Map.Entry<String, Integer> item : map.entrySet()) {
            if (item.getValue() == 1) {
                oddMap.put(item.getKey(), item.getValue());
            } else if (item.getValue() % 2 == 0) {
                evenMap.put(item.getKey(), item.getValue());
            } else {
                evenMap.put(item.getKey(), item.getValue() - 1);
                oddMap.put(item.getKey(), 1);
            }
        }
        String result = "";
        Iterator<Map.Entry<String, Integer>> evenIterator = evenMap.entrySet().iterator();
        if (evenIterator.hasNext() && evenIterator.next().getKey() != "0") {
            for (Map.Entry<String, Integer> item : evenMap.entrySet()) {
                for (int i = 0; i < item.getValue() / 2; i++) {
                    result += item.getKey();
                }
            }
        }

        Iterator<Map.Entry<String, Integer>> oddIterator = evenMap.entrySet().iterator();
        if (oddIterator.hasNext()) {
            Map.Entry<String, Integer> oddNext = oddIterator.next();
            String oddNextKey = oddNext.getKey();
            result += oddNextKey;
        }
        return result;
    }
}
