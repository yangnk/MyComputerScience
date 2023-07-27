//package algorithms.leetcode.archive2022.archive07.lc0723;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class Solution {
//
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        solution.permute(new int[]{1, 2, 3});
//        System.out.println(solution.listlist.toString());
//
//    }
//
//
//    ArrayList<ArrayList<Integer>> listlist = new ArrayList<>();
//    public ArrayList<ArrayList<Integer>> permute(int[] num) {
//        List<Integer> numList = Arrays.stream(num).boxed().collect(Collectors.toList());
//        backTrack(numList, numList, new StringBuffer());
//        return listlist;
//    }
//
//    private void backTrack(List<Integer> numList, List<Integer> curList, StringBuffer str) {
//        if (curList.size() == 0) {
//            String[] strArr = new String(str).split("");
//            ArrayList<Integer> list = (ArrayList) Arrays.stream(strArr).map(a -> Integer.valueOf(a)).collect(Collectors.toList());
//            listlist.add(list);
//            return;
//        }
//        for (int i = 0; i < curList.size(); i++) {
//            Integer integer = curList.get(i);
//            str.append(curList.get(i));
//            curList.remove(i);
//            backTrack(numList, curList, str);
//            curList.add(i, integer);
//        }
//    }
//}