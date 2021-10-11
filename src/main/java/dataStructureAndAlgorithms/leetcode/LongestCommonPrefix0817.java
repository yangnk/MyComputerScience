package dataStructureAndAlgorithms.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-08-17 下午9:10
 **/
public class LongestCommonPrefix0817 {
    public static void main(String[] args) {
        String strs[] = {"dog","racecar","car"};
        String result = longestCommonPrefix(strs);
        System.out.println(result);
    }


    public static String longestCommonPrefix(String[] strs) {
        int index = 0;
        StringBuilder sb = new StringBuilder();
        Set<Character> charSet = new HashSet<>();

        loop:
        while (true) {
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() <= index) {
                    break loop;
                }
                charSet.add(strs[i].charAt(index));
            }
            if (charSet.size() != 1) {
                break;
            }
            sb.append(charSet.toArray()[0]);
            charSet.clear();
            index++;
        }
        return sb.toString();
    }
}
