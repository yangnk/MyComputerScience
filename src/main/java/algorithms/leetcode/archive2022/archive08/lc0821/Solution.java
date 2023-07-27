package algorithms.leetcode.archive2022.archive08.lc0821;

import java.util.Arrays;

public class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int energySum = Arrays.stream(energy).sum();
        int a = energySum + 1 <= initialEnergy ? 0 : energySum + 1 - initialEnergy;
        int sum = initialExperience;
        int b = 0;
        for (int i = 0; i < experience.length; i++) {
            if (sum > experience[i]) {
                sum += experience[i];
            }else {
                int alpha = experience[i] - sum + 1;
                sum += experience[i] + alpha;
                b +=  alpha;
            }
        }
        return a + b;
    }
}
