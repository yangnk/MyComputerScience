package algorithms.leetcode.archive2022.archive08.lc0829;

import java.util.HashSet;
import java.util.Set;

//36-45
public class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (rowSet.contains(i) || colSet.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }


//        Iterator<Integer> rowIter = rowSet.iterator();
//        while (rowIter.hasNext()) {
//            Integer rowNext = rowIter.next();
//            for (int i = 0; i < matrix[0].length; i++) {
//                matrix[rowNext][i] = 0;
//            }
//        }
//
//        Iterator<Integer> colIter = colSet.iterator();
//        while (colIter.hasNext()) {
//            Integer colNext = colIter.next();
//            for (int i = 0; i < matrix.length; i++) {
//                matrix[i][colNext] = 0;
//            }
//        }
    }
}
