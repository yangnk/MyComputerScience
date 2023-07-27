//package algorithms.leetcode.archive05.a0514;
//
//import java.util.ArrayList;
//import java.util.List;
//
////
////
////从单元格 (row, col) 可以移动到 (row - 1, col + 1)、(row, col + 1) 和 (row + 1, col + 1)
//// 三个单元格中任一满足值 严格 大于当前单元格的单元格。
//
//public class Solution2 {
//    public int maxMoves(int[][] grid) {
//
//        List<Ele> list = new ArrayList<>();
//        List<Ele> candidate = new ArrayList<>();
//        Ele cur = new Ele(-1, -1);
//
//        for (int i = 0; i < grid.length; i++) {
//            candidate.add(new Ele(0, i));
//        }
//
//        backTrace(grid, 0, list, candidate, cur, true);
//    }
//
//    private void backTrace(int[][] grid, int i, List<Ele> list, List<Ele> candidate, Ele cur, boolean flag) {
//
//        if (i >= grid[0].length || false == false) {
//            return;
//        }
//
//        for (int j = 0; j < candidate.size(); j++) {
//            Ele ele = candidate.get(j);
//            int rowIndex = ele.getRowIndex();
//            int colIndex = ele.getColIndex();
//
//            flag = false;
//            cur = new Ele(rowIndex - 1, colIndex + 1);
//            list.add(new Ele(rowIndex - 1, colIndex + 1));
//
//            if (grid[rowIndex - 1][colIndex + 1] > grid[rowIndex][colIndex]) {
//                candidate.add(new Ele(rowIndex - 1, colIndex + 1));
//                flag = true;
//            }
//            if (grid[rowIndex][colIndex + 1] > grid[rowIndex][colIndex]) {
//                candidate.add(new Ele(rowIndex, colIndex + 1));
//                flag = true;
//            }
//            if (grid[rowIndex + 1][colIndex + 1] > grid[rowIndex][colIndex]) {
//                candidate.add(new Ele(rowIndex + 1, colIndex + 1));
//                flag = true;
//            }
//
//            backTrace(grid, i + 1, list, candidate, cur, flag);
//
//        }
//
//    }
//
//    class Ele{
//        int rowIndex;
//        int colIndex;
//
//        public Ele(int rowIndex, int colIndex) {
//            this.rowIndex = rowIndex;
//            this.colIndex = colIndex;
//        }
//
//        public int getRowIndex() {
//            return rowIndex;
//        }
//
//        public void setRowIndex(int rowIndex) {
//            this.rowIndex = rowIndex;
//        }
//
//        public int getColIndex() {
//            return colIndex;
//        }
//
//        public void setColIndex(int colIndex) {
//            this.colIndex = colIndex;
//        }
//    }
//}
