package algorithms.leetcode.archive2022.archive07.lc0723;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();

        int[] a = {10, 10, 2, 12, 9};
        char[] b = {'a', 'b', 'c', 'a', 'd'};

        String s = solution1.bestHand(a, b);
        System.out.println(s);
    }


    public String bestHand(int[] ranks, char[] suits) {
        Set<Character> suitsSet = new HashSet<>();
        Set<Integer> ranksSet = new HashSet<>();
        for (Character ch : suits) {
            suitsSet.add(ch);
        }

        int maxCount = 1;
        int count = 1;
        Arrays.sort(ranks);
        for (Integer ch : ranks) {
            if (ranksSet.contains(ch)) {
                count++;
                maxCount = count > maxCount ? count : maxCount;
            } else {
                ranksSet.add(ch);
                count = 1;
            }
        }

        if (suitsSet.size() == 1) {
            return "Flush";
        }
        if (maxCount >= 3) {
            return "Three of a Kind";
        }
        if (maxCount >= 2) {
            return "Pair";
        }
        return "High Card";
    }
}
