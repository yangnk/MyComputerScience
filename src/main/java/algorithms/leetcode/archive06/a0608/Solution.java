package algorithms.leetcode.archive06.a0608;

public class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = (right - left) * Math.min(height[left], height[right]);

        while (left < right) {
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
            int area = (right - left) * Math.min(height[left], height[right]);
            maxArea = area > maxArea ? area : maxArea;
        }
        return maxArea;
    }
}
