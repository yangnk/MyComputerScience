package dataStructureAndAlgorithms.leetcode.lc0528;

class Solution1 {
    public int findKthLargest(int[] nums, int k) {
        //对nums[0,k-1]进行排序
        for (int i = 0; i <= k - 1; i++) {
            int maxIndex = i;
            int maxNum = nums[i];
            for (int j = i; j < nums.length; j++) {
                if (nums[j] > maxNum) {
                    maxIndex = j;
                    maxNum = nums[maxIndex];
                }
            }
            swap(nums, i, maxIndex);
        }
        return nums[k - 1];
    }

    private void swap(int[] nums, int j, int k) {
        int tmp = nums[j];
        nums[j] = nums[k];
        nums[k] = tmp;
    }
}