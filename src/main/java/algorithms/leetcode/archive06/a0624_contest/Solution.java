package algorithms.leetcode.archive06.a0624_contest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        int i = Solution.maximumNumberOfStringPairs(new String[]{"cd", "ac", "dc", "ca", "zz"});
        System.out.println("i = " + i);
    }

    public static int maximumNumberOfStringPairs(String[] words) {
        List<String> stringList = Arrays.stream(words).collect(Collectors.toList());
        int[] flagArr = new int[words.length];
        Arrays.fill(flagArr, 0);
        int count = 0;

        for (int i = 0; i < stringList.size(); i++) {
            if (flagArr[i] == -1) {
                continue;
            }
            StringBuilder stringBuilder = new StringBuilder(stringList.get(i));
            stringList.set(i, "");
            int index = stringList.indexOf(stringBuilder.reverse().toString());
            if (index >= 0) {
                count++;
                flagArr[index] = -1;
                stringList.set(index, "");
            }
        }
        return count;
    }
}
