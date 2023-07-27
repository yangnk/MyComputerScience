package algorithms.leetcode.archive2022.archive07.lc0710;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangningkai
 * @create 2022-07-10 11:40
 **/

public class Solution2 {
    public boolean canChange(String start, String target) {
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        for (int i = 0; i < start.length(); i++) {
            char c = start.charAt(i);
            char c1 = target.charAt(i);
            if (c != '_') {
                list1.add(c);
            }
            if (c1 != '_') {
                list2.add(c1);
            }
        }
        if (!list1.equals(list2)) {
            System.out.printf("!list1.equals(list2)\n");
            return false;
        }
        int startIndex = -1;

        for (int targetIndex = 0; targetIndex < target.length(); targetIndex++) {
            char c1 = target.charAt(targetIndex);
            if (c1 != '_') {
                while (startIndex < start.length()) {
                    char c = start.charAt(++startIndex);
                    if (c == '_') {
                        continue;
                    }
                    break;
                }

                if (c1 == 'L') {
                    if (startIndex < targetIndex) {
                        return false;
                    }
                    if (startIndex > targetIndex && start.charAt(startIndex - 1) != '_') {
                        return false;
                    }
                }
                if (c1 == 'R') {
                    if (startIndex > targetIndex) {
                        return false;
                    }
                    if (startIndex < targetIndex && start.charAt(startIndex + 1) != '_') {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
