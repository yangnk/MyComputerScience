package dataStructureAndAlgorithms.leetcode.others;

import java.util.HashSet;
import java.util.Set;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-12-07 20:24
 **/
public class String1207 {
    public static void main(String[] args) {
        String[] strs = {""};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        Set<Character> characterSet = new HashSet<>();
        int index = 0;
        if (strs.length == 0 || strs == null) {
            return null;
        }

        while (true) {
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() <= index) {
                    return strs[0].substring(0, index);
                }

                characterSet.add(strs[i].charAt(index));
            }
            if (characterSet.size() == 1) {
                index++;
                characterSet.clear();
                continue;
            }
            return strs[0].substring(0, index);
        }
    }
}
