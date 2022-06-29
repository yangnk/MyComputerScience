package dataStructureAndAlgorithms.leetcode.lc0528;

class Solution {
    public String minNumber(int[] nums) {
        boolean sorted = true;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (leftGreaterThanRight(nums, j, j + 1)) {
                    swap(nums, j, j + 1);
                    sorted = false;
                }
            }
            if (sorted == true) {
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int item : nums) {
            sb.append(item);
        }
        return new String(sb);
    }

    private boolean leftGreaterThanRight(int[] nums, int j, int p) {
        String s1 = "" + nums[j] + nums[p];
        String s2 = "" + nums[p] + nums[j];
        int result = s1.compareTo(s2);
        return result > 0 ? true : false;
    }

    private void swap(int[] nums, int j, int k) {
        int tmp = nums[j];
        nums[j] = nums[k];
        nums[k] = tmp;
    }
}