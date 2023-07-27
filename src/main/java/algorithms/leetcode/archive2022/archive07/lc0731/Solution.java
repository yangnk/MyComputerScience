//package algorithms.leetcode.archive2022.archive07.lc0731;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class Solution {
//
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int operations = solution.minimumOperations(new int[]{0});
//        System.out.println("operations = " + operations);
//    }
//
//    public int minimumOperations(int[] nums) {
//        HashSet<Integer> set = new HashSet<>();
//        for (Integer item : nums) {
//            if (item != 0) {
//                set.add(item);
//            }
//        }
//        int count = 0;
//        while (set.size() > 0) {
//            Integer min = Collections.min(set);
//            set = (HashSet) set.stream().map(a -> a - min).filter(a -> a != 0).collect(Collectors.toSet());
//            count++;
//        }
//        return count;
//    }
//}
