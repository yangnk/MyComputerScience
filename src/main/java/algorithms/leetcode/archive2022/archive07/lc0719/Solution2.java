package algorithms.leetcode.archive2022.archive07.lc0719;

public class Solution2 {
    public int InversePairs(int [] array) {
        if (array.length == 1) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}