package dataStructureAndAlgorithms.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-12-06 15:43
 **/
public class LongestSubstring1206 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }


    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 1;
        Set<Character> filterSet = new HashSet<Character>();

        if (s.length() == 0 || s == null) {
            return 0;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            filterSet.add(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                filterSet.add(s.charAt(j));
                if (filterSet.size() == j - i + 1) {
                    maxLength = j - i + 1 > maxLength ? j - i + 1 : maxLength;
                    continue;
                }
                break;
            }
            filterSet.clear();
        }
        return maxLength;
    }
}
