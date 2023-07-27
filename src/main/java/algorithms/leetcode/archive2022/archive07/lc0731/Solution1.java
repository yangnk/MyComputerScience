package algorithms.leetcode.archive2022.archive07.lc0731;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int groups = solution1.maximumGroups(new int[]{10, 6, 12, 7, 3, 5});
        System.out.println("groups = " + groups);

    }

    public int maximumGroups(int[] grades) {
        List<Integer> list = Arrays.stream(grades).boxed().collect(Collectors.toList());
        //降序排序
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        int count = 1;
        while (list.size() >= count) {
            int sum = list.subList(0, count).stream().mapToInt(Integer::intValue).sum();
            list = list.subList(count, list.size());
            int index = list.size();
            while (index > 0 && index > count) {
                if (list.subList(index - count, index).stream().mapToInt(Integer::intValue).sum() > sum) {
                    index++;
                    continue;
                }
                count++;
                break;
            }
        }
        return count;
    }
}
