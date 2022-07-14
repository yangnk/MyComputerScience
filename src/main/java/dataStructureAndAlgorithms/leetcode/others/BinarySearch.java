package dataStructureAndAlgorithms.leetcode.others;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-07-08 下午8:52
 **/
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        int search = search(nums, target);
        System.out.println(search);

    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int flag = 0;
        while (start <= end) {
            flag = (start + end) / 2;
            if (nums[flag] == target) {
                return flag;
            } else if (nums[flag] < target) {
                start = flag + 1;
            } else {
                end = flag - 1;
            }
        }
        return -1;
    }
}
