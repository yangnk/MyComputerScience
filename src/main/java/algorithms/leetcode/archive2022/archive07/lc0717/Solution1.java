package algorithms.leetcode.archive2022.archive07.lc0717;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {
    public static void main(String[] args) {
        int sum = maximumSum(new int[]{10, 12, 19, 14});
        System.out.println(sum);
    }
    public static int  maximumSum(int[] nums) {
        List<Integer> list = new ArrayList<>();
        nums = Arrays.stream(nums).boxed().sorted((a, b) -> b - a).mapToInt(p -> p).toArray();

        for (int i = 0; i < nums.length; i++) {
            int ele = nums[i];
            int sum = 0;

            String str = String.valueOf(ele);
            String[] strArr = str.split("");
            for (String item : strArr) {
                sum += Integer.valueOf(item);
            }
            list.add(sum);
        }
        int max = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            int a = list.get(i);
            int index = list.indexOf(a);
            int index1 = list.subList(i + 1, list.size()).indexOf(a);
            if (index1 != -1) {
                int lastIndex = index1 + i + 1;
                int sum = nums[index] + nums[lastIndex];
                max = sum > max ? sum : max;
            }
        }
        return max;
    }
}
