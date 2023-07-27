package algorithms.leetcode.archive2022.archive10.lc1001;

import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int ans = solution1.lastMaterial(new int[]{6,4,10});
        System.out.println("ans = " + ans);

    }
    public int lastMaterial(int[] material) {
        Arrays.sort(material);
        while (material.length >= 2) {
            material[material.length - 1] -= material[material.length - 2];
            material[material.length - 2] -= material[material.length - 2];
            Arrays.sort(material);
            material = Arrays.copyOfRange(material, 1, material.length);
        }
        return material[0];
    }
}
