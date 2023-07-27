package algorithms.leetcode.archive05.a0514;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] ints = circularGameLosers(2, 1);

        System.out.println(Arrays.toString(ints));

    }

    public static int[] circularGameLosers(int n, int k) {
        Set<Integer> existedSet = new HashSet<>();
        int start = 1;
        existedSet.add(start);

        for (int i = 1; ; i++) {
            int step = i * k;
            int end = (start + step) % n;
            if (end == 0) {
                end = n;
            }
            if (existedSet.contains(end)) {
                break;
            }
            existedSet.add(end);
            start = end;
            System.out.printf("第i轮:%d, 落在end位置:%d",i,end);
            System.out.println();
        }

        List<Integer> resList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (existedSet.contains(i)) {
                continue;
            }
            resList.add(i);
        }

        return resList.stream().mapToInt(Integer::intValue).toArray();
    }
}
