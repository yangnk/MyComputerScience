package dataStructureAndAlgorithms.leetcode.others;

import java.util.Arrays;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-11-29 22:30
 **/
public class ContainerWthMostWater1129a {
    public static void main(String[] args) {
        int[] test = {1, 1};
        int output = maxArea(test);
        System.out.println(output);

    }

    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int ans = 0;
        while (i < j) {
            ans = height[i] < height[j] ? Math.max(ans, (j - i) * height[i++]) : Math.max(ans, (j - i) * height[j--]);
        }
        return ans;
    }


}

