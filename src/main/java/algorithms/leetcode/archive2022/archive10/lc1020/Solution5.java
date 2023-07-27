package algorithms.leetcode.archive2022.archive10.lc1020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution5 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == -1) {
                continue;
            }
            int index = Arrays.binarySearch(nums2, nums1[i]);
            if (index < 0) {
                nums1[i] = -1;
            } else {
                list.add(nums1[i]);
                nums1[i] = -1;
                nums2[index] = -1;
            }
            Arrays.sort(nums2);
        }
        Arrays.sort(nums1);
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] == -1) {
                continue;
            }
            int index = Arrays.binarySearch(nums1, nums2[i]);
            if (index < 0) {
                nums2[i] = -1;
            } else {
                list.add(nums2[i]);
                nums1[i] = -1;
                nums2[index] = -1;
            }
            Arrays.sort(nums1);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
