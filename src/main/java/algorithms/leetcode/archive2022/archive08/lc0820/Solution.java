package algorithms.leetcode.archive2022.archive08.lc0820;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int index = -1;
        if (nums == null || nums.length == 0) {
            return result;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                index = mid;
                break;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (index == -1) {
            return result;
        }
        int first = index;
        int last = index;
        while (first - 1 >= 0 && nums[first - 1] == target) {
            first--;
        }
        while (last + 1 <= nums.length - 1 && nums[last + 1] == target) {
            last++;
        }
        result[0] = first;
        result[1] = last;
        return result;
    }
}