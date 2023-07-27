package algorithms.leetcode.archive2022.archive12.lc1225;

public class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        if (words[startIndex].equals(target)) {
            return 0;
        }

        //从左向右找到最小值-->从右到左找到最小值
        int len = words.length;
        int ptr1 = (startIndex + 1) % len;
        int min1 = -1;
        int step1 = 1;
        while (ptr1 != startIndex) {
            if (words[ptr1].equals(target)) {
                min1 = step1;
                break;
            }
            ptr1 = (ptr1 + 1) % len;
            step1++;
        }

        int ptr2 = (startIndex - 1 + len) % len;
        int min2 = -1;
        int step2 = 1;
        while (ptr2 != startIndex) {
            if (words[ptr2].equals(target)) {
                min2 = step2;
                break;
            }
            ptr2 = (ptr2 - 1 + len) % len;
            step2++;
        }
        return min1 > min2 ? min2 : min1;
    }
}
