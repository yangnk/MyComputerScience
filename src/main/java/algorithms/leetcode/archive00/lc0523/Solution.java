package dataStructureAndAlgorithms.leetcode.lc0523;

import java.util.PriorityQueue;

//总结：PriorityQueue只能保证出队列的顺序是自然排序，用poll()方法出队列，迭代方式访问是不保证顺序的

class Solution {
    public static void main(String[] args) {
        int[][] a = {{8, 7}, {9, 9}, {7, 4}, {9, 7}};
        int i = maxWidthOfVerticalArea(a);
        System.out.println(i);
    }


    public static int maxWidthOfVerticalArea(int[][] points) {

        //将x坐标放到优先队列中排序
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int[] item : points) {
            queue.add(item[0]);
        }

        //优先队列转数组
        int[] ints = new int[queue.size()];
        int index = 0;
        while (!queue.isEmpty()) {
            ints[index++] = queue.poll();
        }

        //找出最大的间距
        int start = 0;
        int maxWidth = 0;
        while (start < ints.length - 1) {
            int tmp = ints[start + 1] - ints[start];
            if (tmp > maxWidth) {
                maxWidth = tmp;
            }
            start++;
        }
        return maxWidth;
    }
}