//package dataStructureAndAlgorithms.oj.bd;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
///**
// * ${DESCRIPTION}
// *
// * @author yangningkai
// * @create 2021-11-25 09:26
// **/
//
//public class ThreeSum1125 {
//    public static void main(String[] args) {
//        int[] ints = new int[]{0, 0, 0};
//        threeSum(ints);
//    }
//
//    public static List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> listList = new ArrayList<>();
//        if (nums == null || nums.length <= 2) {
//            return listList;
//        }
//
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length - 2; i++) {
//            if (i != 0 && nums[i] != nums[i - 1]) {
//                for (int j = i + 1; j < nums.length - 1; j++) {
//                    if (nums[i] == nums[i + 1] || nums[j] != nums[j - 1]) {
//                        int sum = nums[i] + nums[j];
//                        int leftNum = -sum;
//                        int index = Arrays.binarySearch(nums, j + 1, nums.length, leftNum);
//                        if (index >= j) {
//                            List<Integer> list = new ArrayList<>();
//                            list.add(nums[i]);
//                            list.add(nums[j]);
//                            list.add(nums[index]);
//                            listList.add(list);
//                        }
//                    }
//                }
//            }
//        }
//        return listList;
//
//    }
//}
