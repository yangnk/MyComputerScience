package dataStructureAndAlgorithms.newCoder.nc0524;

public class Solution1 {

    public static void main(String[] args) {
        int target = 7;
        int[][] array = {{}};
        boolean result = Find(target, array);
        System.out.println(result);
    }

    public static boolean Find(int target, int [][] array) {
        if (array == null || array[0].length == 0) {
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] > target) {
                return false;
            }
            if (array[i][array[0].length - 1] < target) {
                continue;
            }
            if (isExist(array[i], target)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isExist(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (nums[middle] == target) {
                return true;
            } else if (nums[middle] < target) {
                start = middle + 1;
            }else {
                end = middle - 1;
            }
        }
        return false;
    }
}