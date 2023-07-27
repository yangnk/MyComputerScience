package algorithms.leetcode.archive06.a0603;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution1 {

    public int semiOrderedPermutation(int[] nums) {

        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int firstIndex = list.indexOf(1);
        int lastIndex = list.indexOf(nums.length);

        if (firstIndex < lastIndex) {
            return firstIndex + (nums.length - 1 - lastIndex);
        } else {
            return firstIndex + (nums.length - 1 - lastIndex) - 1;
        }
    }
}
