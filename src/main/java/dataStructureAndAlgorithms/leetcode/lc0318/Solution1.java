package dataStructureAndAlgorithms.leetcode.lc0318;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-03-18 11:25
 **/
public class Solution1 {
    public static void main(String[] args) {
        int[] ints = {1, 4, 2, 9, 4};
        findKthLargest(ints, 2);

    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int item : nums) {
            priorityQueue.offer(item);
        }
        for (int i = 0; i < k - 1; i++) {
            priorityQueue.poll();
        }
        return priorityQueue.peek();
    }
}
