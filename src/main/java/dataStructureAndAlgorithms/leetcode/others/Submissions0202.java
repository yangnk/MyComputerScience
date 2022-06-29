package dataStructureAndAlgorithms.leetcode.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-02-02 21:29
 **/
public class Submissions0202 {

    public static void main(String[] args) {
        int nums[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] ans = maxSlidingWindow(nums, k);
        System.out.println();

    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        for (int i = 0, j = k; j <= nums.length; i++, j++) {
            int maxValue = maxValue(Arrays.copyOfRange(nums, i, j));
            res[i] = maxValue;
        }
        return res;
    }

    public static int maxValue(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }
}
