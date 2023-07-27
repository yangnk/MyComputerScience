package algorithms.leetcode.archive01.a0128;

public class Solution {

    public static void main(String[] args) {
        String str = "aaabbccaabbcc";
        String subStr = "a1b";
        int indexOf = str.indexOf(subStr);
        System.out.println("indexOf = " + indexOf);

    }

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
