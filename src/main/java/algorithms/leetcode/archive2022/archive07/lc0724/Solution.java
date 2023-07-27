package algorithms.leetcode.archive2022.archive07.lc0724;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        char character = solution.repeatedCharacter("eesll");
        System.out.println(character);

    }

    public char repeatedCharacter(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        char result = ' ';
        for (Character ch : chars) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
                continue;
            }
            result = ch;
            break;
        }
        return result;
    }
}
