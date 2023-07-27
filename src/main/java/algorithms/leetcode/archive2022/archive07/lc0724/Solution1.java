package algorithms.leetcode.archive2022.archive07.lc0724;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[][] aa = {{11, 1}, {1, 11}};
        int equalPairs = solution1.equalPairs(aa);
        System.out.println(equalPairs);

    }

    public int equalPairs(int[][] grid) {
        List<String> rowList = new ArrayList<>();
        List<String> lineList = new ArrayList<>();

        for (int i = 0; i < grid.length; i++) {
            String row = Arrays.stream(grid[i]).mapToObj(a -> String.valueOf(a)).collect(Collectors.joining("-"));
            rowList.add(row);
        }

        for (int i = 0; i < grid.length; i++) {

            int[] tmp = new int[grid.length];
            for (int j = 0; j < grid.length; j++) {
                tmp[j] = grid[j][i];
            }

            String line = Arrays.stream(tmp).mapToObj(a -> String.valueOf(a)).collect(Collectors.joining("-"));
            lineList.add(line);
        }

        long sum = 0;
        for (int i = 0; i < grid.length; i++) {
            int f = i;
            long count = lineList.stream().filter(a -> a.equals(rowList.get(f))).count();
            sum += count;
        }
        return (int)sum;
    }
}
