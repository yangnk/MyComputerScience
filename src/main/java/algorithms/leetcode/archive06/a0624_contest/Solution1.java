package algorithms.leetcode.archive06.a0624_contest;

public class Solution1 {
    public int longestString(int x, int y, int z) {
        int count = z + Math.min(x, y) * 2;
        if (x != y) {
            count += 1;
        }
        return count * 2;
    }
}
