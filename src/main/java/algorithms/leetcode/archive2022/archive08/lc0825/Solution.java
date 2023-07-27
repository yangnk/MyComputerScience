package algorithms.leetcode.archive2022.archive08.lc0825;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {

    }

    public boolean isValidSudoku(char[][] board) {
        //判断行
        Set<Character> rowSet = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (board[i][j] <= '0' || board[i][j] > '9' || rowSet.contains(board[i][j])) {
                    return false;
                }
                rowSet.add(board[i][j]);
            }
            rowSet.clear();
        }
        //判读列
        Set<Character> colSet = new HashSet<>();
        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 9; i++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (board[i][j] <= '0' || board[i][j] > '9' || colSet.contains(board[i][j])) {
                    return false;
                }
                colSet.add(board[i][j]);
            }
            colSet.clear();
        }
        //判断3x3小格
        Set<Character> gridSet = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            int a = i / 3;
            int b = i % 3;
            for (int j = 3 * a; j < 3 * a + 3; j++) {
                for (int k = 3 * b; k < 3 * b + 3; k++) {
                    if (board[j][k] == '.') {
                        continue;
                    }
                    if (board[j][k] <= '0' || board[j][k] > '9' || gridSet.contains(board[j][k])) {
                        return false;
                    }
                    gridSet.add(board[j][k]);
                }
            }
            gridSet.clear();
        }
        return true;
    }
}
