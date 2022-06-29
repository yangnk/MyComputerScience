package dataStructureAndAlgorithms.leetcode.others;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-08-24 23:10
 **/
public class SearchInsertPosition0824 {
    public static void main(String[] args) {
        int[] nums = {1, 3};
        int target = 3;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int start = 0;
        int end = len - 1;
        int index = len / 2;
        if (target <= nums[0]) {
            return 0;
        }
        if (target > nums[len - 1]) {
            return len;
        }
        while (index > start && index < end) {
            if (nums[index] == target) {
                return index;
            }
            if (nums[index] < target) {
                start = index;
            } else {
                end = index;
            }
            index = (start + end) / 2;
        }
        return start + 1;

    }
}
