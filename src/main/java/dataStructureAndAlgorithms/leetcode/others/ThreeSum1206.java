package dataStructureAndAlgorithms.leetcode.others;

import java.util.*;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-12-06 23:53
 **/
public class ThreeSum1206 {
    public static void main(String[] args) {
        List<List<Integer>> a = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println(a.toString());
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultListList = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        if (nums.length < 3) {
            return resultListList;
        }
        for (int i = 0; i < nums.length; i++) {
            int leftNum1 = 0 - nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                List<Integer> resultList = new ArrayList<Integer>();
                int leftNum2 = leftNum1 - nums[j];

                int[] subNums = Arrays.copyOfRange(nums, j + 1, nums.length);
                int k = Arrays.binarySearch(subNums, leftNum2);

                if (k >= 0) {
                    resultList.add(nums[i]);
                    resultList.add(nums[j]);
                    resultList.add(nums[j + k + 1]);
                    if (resultListList.contains(resultList)) {
                        break;
                    }
                    resultListList.add(resultList);
                }
            }
        }
        return resultListList;
    }


}

