package dataStructureAndAlgorithms.leetcode.lc0308;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-03-08 23:57
 **/
public class LC0308 {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (true) {
            int middle = (start + end) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }

            if (start > end) {
                break;
            }
        }
        return -1;
    }
}
