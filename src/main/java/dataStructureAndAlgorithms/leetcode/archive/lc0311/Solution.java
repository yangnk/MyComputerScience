package dataStructureAndAlgorithms.leetcode.lc0311;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-03-11 22:43
 **/
class Solution {
    public static void main(String[] args) {
        System.out.println(maxPower("abbcccddddeeeeedcba"));
    }
    public static int maxPower(String s) {
        int from = 0;
        int to = 0;
        int maxLen = 1;
        for (to = 0; to < s.length(); to++) {
            if (s.charAt(from) == s.charAt(to)) {
                if (to == s.length() - 1) { maxLen = (to - from + 1) > maxLen ? (to - from + 1) : maxLen;}
                continue;
            }
            maxLen = (to - from ) > maxLen ? (to - from ) : maxLen;
            from = to;
        }
        return maxLen;
    }
}