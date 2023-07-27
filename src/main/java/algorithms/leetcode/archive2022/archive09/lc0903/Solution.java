package algorithms.leetcode.archive2022.archive09.lc0903;

public class Solution {
    int[][] DIRECTION = new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    int rowLen;
    int colLen;
    int[][] visited;
    char[] chars;
    char[][] board;

    public boolean exist(char[][] board, String word) {

        this.rowLen = board.length;
        this.colLen = board[0].length;
        this.visited = new int[rowLen][colLen];
        this.chars = word.toCharArray();
        this.board = board;

        if (rowLen == 0) {
            return false;
        }

        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                if (backTrack(i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backTrack(int x, int y, int begin) {
        if (begin == chars.length - 1) {
            return board[x][y] == chars[begin];
        }
        if (board[x][y] == chars[begin]) {
            visited[x][y] = 1;
            for (int[] item : DIRECTION) {
                int newX = x + item[0];
                int newY = y + item[1];
                if (inArea(newX, newY) && visited[newX][newY] != 1) {
                    if (backTrack(newX, newY, begin + 1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    private boolean inArea(int x, int y) {
        return x >= 0 && x < rowLen && y >= 0 && y < colLen;
    }
}
