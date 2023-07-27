package algorithms.leetcode.archive05.a0514;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    public static void main(String[] args) {
        boolean b = doesValidArrayExist(new int[]{1,0});
        System.out.println("b = " + b);
    }

    public static boolean doesValidArrayExist(int[] derived) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(0);
        list2.add(1);

        for (int i = 0; i < derived.length; i++) {
            list1.add(getSecond(list1.get(i), derived[i]));
            list2.add(getSecond(list2.get(i), derived[i]));
        }
        if (list1.get(0) == list1.get(list1.size() - 1)
                || list2.get(0) == list2.get(list2.size() - 1)) {
            return true;
        }
        return false;
    }

    private static int getSecond(int first, int ans) {
        if (first == 0 && ans == 0) {
            return 0;
        }
        if (first == 0 && ans == 1) {
            return 1;
        }
        if (first == 1 && ans == 0) {
            return 1;
        }
        if (first == 1 && ans == 1) {
            return 0;
        }
        return -1;
    }
}
