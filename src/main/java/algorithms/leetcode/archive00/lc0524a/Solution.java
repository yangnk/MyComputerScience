package dataStructureAndAlgorithms.newCoder.nc0524;

import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param nums   int整型一维数组
     * @param target int整型
     * @return int整型
     */
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {

            return -1;
        }

        int start = 0;
        int end = nums.length - 1;
        if (nums[start] == target) {
            return start;
        }
        if (nums[end] == target) {
            return end;
        }

        int middle = (start + end) / 2;
        while (middle > start && middle < end) {
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                end = middle;
            } else {
                start = middle;
            }
            middle = (start + end) / 2;
        }
        return -1;
    }

    public int search1(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }
}