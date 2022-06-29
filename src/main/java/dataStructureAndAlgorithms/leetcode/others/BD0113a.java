package dataStructureAndAlgorithms.leetcode.others;


//给你两个字符串 s1 和 s2 ，写一个函数来判断 s2 是否包含 s1 的排列。如果是，返回 true ；否则，返回 false 。
//
//        换句话说，s1 的排列之一是 s2 的 子串 。
//
//
//
//        示例 1：
//
//        输入：s1 = "ab" s2 = "eidbaooo"
//        输出：true
//        解释：s2 包含 s1 的排列之一 ("ba").
//        示例 2：
//
//        输入：s1= "ab" s2 = "eidboaoo"
//        输出：false

import java.util.Arrays;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-01-13 23:19
 **/
public class BD0113a {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }
    public static boolean checkInclusion(String s1, String s2) {
        char[] s1Chars = s1.toCharArray();
        Arrays.sort(s1Chars);

        for (int startIndex = 0, endIndex = s1.length(); endIndex <= s2.length(); startIndex++, endIndex++) {
            String subS2 = s2.substring(startIndex, endIndex);
            char[] s2Chars = subS2.toCharArray();
            Arrays.sort(s2Chars);
            if (new String(s1Chars).equals(new String(s2Chars))) {
                return true;
            }
        }
        return false;
    }
}
