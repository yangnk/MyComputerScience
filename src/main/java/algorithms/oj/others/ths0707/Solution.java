package algorithms.oj.others.ths0707;

/**
 * @author yangningkai
 * @create 2022-07-07 19:07
 **/

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int targetNum = 1;
        System.out.println(binarySearch(nums, targetNum));
    }

    static int binarySearch(int[] nums, int targetNum) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        int mid = len / 2;
        while (left <= right) {
            if (targetNum < nums[mid]) {
                right = mid - 1;
            } else if (targetNum > nums[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
            mid = left + (right - left) / 2;
        }
        return -1;
    }
}
