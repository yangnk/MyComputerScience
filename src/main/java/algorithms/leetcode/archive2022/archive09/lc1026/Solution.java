package algorithms.leetcode.archive2022.archive09.lc1026;

public class Solution {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            String s1 = s.substring(i, i + 1);
            int index = s.substring(i + 1).indexOf(s1);
            int index1 = s.substring(0, i).indexOf(s1);
            if (index >= 0 || index1 >= 0) {
                continue;
            }
            return i;
        }
        return -1;
    }
}
