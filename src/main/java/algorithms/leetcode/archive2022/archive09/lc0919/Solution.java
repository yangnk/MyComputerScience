package algorithms.leetcode.archive2022.archive09.lc0919;

import java.util.*;

//map中key和value如何互换？

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = solution.frequencySort(new int[]{-1, 1, -6, 4, 5, -6, 1, 4, 1});
        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));

    }

    public int[] frequencySort(int[] nums) {
        List<Pair> list = new ArrayList<>();
        int[] ret = new int[nums.length];
        Arrays.sort(nums);
        int count = 1;
        int num = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == num) {
                count++;
                continue;
            } else {
                list.add(new Pair(count, num));
                count = 1;
                num = nums[i];
            }
        }

        list.add(new Pair(count, num));
        Collections.sort(list, (o1, o2) -> {
            return (o1.count != o2.count) ? o1.count - o2.count : o2.num - o1.num;
        });

        int ptr = 0;
        for (int i = 0; i < list.size(); i++) {
            Arrays.fill(ret, ptr, ptr + list.get(i).count, list.get(i).num);
            ptr += list.get(i).count;
        }
        return ret;
    }
}

class Pair {
    int count;
    int num;
    public Pair(int count, int num) {
        this.count = count;
        this.num = num;
    }
}
