package algorithms.leetcode.archive06.a0603;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int minimizedStringLength(String s) {
        char[] chars = s.toCharArray();
        Set<Character> charSet = new HashSet<>();

        for (char ch : chars) {
            charSet.add(ch);
        }
        return charSet.size();
    }

}
