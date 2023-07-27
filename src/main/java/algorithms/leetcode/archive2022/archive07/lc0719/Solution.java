package algorithms.leetcode.archive2022.archive07.lc0719;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    Map<Integer, String> map = new HashMap<>();
    List<String> list = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits == null || "".equals(digits)) {
            return list;
        }
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        backTrace(digits, "", 0);
        return list;
    }

    private void backTrace(String digits, String s, int index) {
        if (index == digits.length()) {
            list.add(s);
            return;
        } else {
            int num = digits.charAt(index) - '0';
            String letterStr = map.get(num);
            for (int i = 0; i < letterStr.length(); i++) {
                String letter = String.valueOf(letterStr.charAt(i));
                backTrace(digits, s + letter, index + 1);
            }
        }
    }
}