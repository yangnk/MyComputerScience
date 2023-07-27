package algorithms.leetcode.archive06.a0611;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public int findNonMinOrMax(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        if (set.size() <= 2) {
            return -1;
        }
        Integer min = Collections.min(set);
        Integer max = Collections.max(set);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer nextInt = iterator.next();
            if (nextInt != min && nextInt != max) {
                return nextInt;
            }
        }
        return 0;
    }
}
