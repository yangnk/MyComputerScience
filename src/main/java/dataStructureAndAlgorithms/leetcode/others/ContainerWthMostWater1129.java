package dataStructureAndAlgorithms.leetcode.others;

import java.util.Arrays;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-11-29 22:30
 **/
public class ContainerWthMostWater1129 {
    public static void main(String[] args) {
        int[] test = {1, 1};
        int output = maxArea(test);
        System.out.println(output);

    }

    public static int maxArea(int[] height) {
        int[] heightMostWater = new int[height.length - 1];
        for (int i = 0; i < height.length - 1; i++) {
            heightMostWater[i] = getIndexMostWater(height, i, height.length - 1);
        }
        Arrays.sort(heightMostWater);
        return heightMostWater[height.length - 2];
    }

    public static int getIndexMostWater(int[] height, int startIndex, int endIndex) {
        if (startIndex == endIndex - 1) {
            return height[startIndex] > height[endIndex] ? height[endIndex] : height[startIndex];
        }
        int a = getIndexMostWater(height, startIndex, endIndex - 1);
        int b = height[startIndex] > height[endIndex] ? height[endIndex] * (endIndex - startIndex) : height[startIndex] * (endIndex - startIndex);
        return a > b ? a : b;
    }
}

