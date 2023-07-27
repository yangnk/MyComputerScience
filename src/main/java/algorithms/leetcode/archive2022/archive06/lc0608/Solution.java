package algorithms.leetcode.lc0608;


class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //获取最大值和最小值
        int left = 1;
        int right = 0;
        for (int item : piles) {
            right = Math.max(right, item);
        }
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (calculateSum(piles, middle) > h) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return left;
    }

    private int calculateSum(int[] piles, int speed) {
        int sum = 0;
        for (int item : piles) {
            sum += (item - 1) / speed + 1;
        }
        return sum;
    }
}