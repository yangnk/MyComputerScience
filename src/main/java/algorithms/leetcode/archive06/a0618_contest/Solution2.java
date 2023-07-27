package algorithms.leetcode.archive06.a0618_contest;

//
//给你一个下标从 0 开始的整数数组 nums ，它包含 n 个 互不相同 的正整数。如果 nums 的一个排列满足以下条件，我们称它是一个特别的排列：
//
//        对于 0 <= i < n - 1 的下标 i ，要么 nums[i] % nums[i+1] == 0 ，要么 nums[i+1] % nums[i] == 0 。
//        请你返回特别排列的总数目，由于答案可能很大，请将它对 109 + 7 取余 后返回。
//

//6893. 特别的排列:https://leetcode.cn/problems/special-permutations/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution2 {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int i = solution2.specialPerm(new int[]{1, 4, 3});
        System.out.println("i = " + i);
    }

    public static int totalSum = 0;
    public int specialPerm(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        for (int i = 0; i < numsList.size(); i++) {
            list.add(numsList.get(i));
            backTrace(numsList, list, 1);
            list.remove(list.size() - 1);
        }
        if (totalSum > Math.pow(10, 9) + 7) {
            return (int) (totalSum % Math.pow(10, 9) + 7);
        }
        System.out.println("totalSum = " + totalSum);
        return totalSum;
    }
    //list是符合要求的待组合，count是已经排列元素个数
    private void backTrace(List<Integer> numsList, List<Integer> list, int count) {
        System.out.println("totalSum00 = " + totalSum);
        if (count == numsList.size()) {
            System.out.println("list = " + list);
            System.out.println("totalSum = " + totalSum);
            totalSum++;
            return;
        }
        for (int i = 0; i < numsList.size(); i++) {
            Integer value = numsList.get(i);
            if (list.contains(value)) {
                continue;
            }
            int lastValue = value % list.get(list.size() - 1);
            int lastValue1 = list.get(list.size() - 1) % value;
            if (lastValue == 0 || lastValue1 == 0) {
                list.add(value);
                backTrace(numsList, list, count + 1);
                list.remove(value);
            } else {
                continue;
            }
        }
    }
}
