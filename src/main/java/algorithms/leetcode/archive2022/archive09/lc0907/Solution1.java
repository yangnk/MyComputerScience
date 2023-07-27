package algorithms.leetcode.archive2022.archive09.lc0907;

import java.util.Arrays;

public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        String s = solution1.reorderSpaces(" a");
        System.out.println(s);
    }

    public String reorderSpaces(String text) {
        int len = text.length();
        String[] words = text.trim().split("\\s+");
        int spaceCount = len;
        for (String word : words) {
            spaceCount -= word.length();
        }

        if (words.length == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(words[0]);
            char[] ch1 = new char[spaceCount];
            Arrays.fill(ch1, ' ');
            sb.append(ch1);
            return new String(sb);
        }

        int gapSpace = spaceCount / (words.length - 1);
        int tailSpace = spaceCount - gapSpace * (words.length - 1);

        StringBuilder sb = new StringBuilder();
        char[] ch1 = new char[gapSpace];
        Arrays.fill(ch1, ' ');
        char[] ch2 = null;
        if (tailSpace != 0) {
            ch2 = new char[tailSpace];
            Arrays.fill(ch2, ' ');
        }

        for (int i = 0; i < words.length - 1; i++) {
            sb.append(words[i]);
            sb.append(ch1);
        }
        sb.append(words[words.length - 1]);

        if (tailSpace != 0) {
            sb.append(ch2);
        }
        return new String(sb);
    }
}
