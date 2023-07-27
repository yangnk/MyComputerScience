package algorithms.leetcode.archive02.a0216;
//
//
//给你一个 m x n 的矩阵 board ，由若干字符 'X' 和 'O' ，找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。

import java.util.Arrays;

public class Solution {
    char result[][];
    public void solve(char[][] board) {
        result = new char[board.length][board[0].length];

        for (int i = 0; i < result.length; i++) {
            Arrays.fill(result[i], 'X');
        }

        //左-->右
        for (int i = 0; i < board[0].length - 1; i++) {
            getResult(board, 0, i);
        }
        //上-->下
        for (int i = 0; i < board.length - 1; i++) {
            getResult(board, i, board[0].length - 1);
        }
        //右-->左
        for (int i = board[0].length - 1; i > 0; i--) {
            getResult(board, board.length - 1, i);
        }
        //下-->上
        for (int i = board.length - 1; i > 0; i--) {
            getResult(board, i, 0);
        }
//        board = result;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (result[i][j] == 'X') {
                    board[i][j] = 'X';
                } else {
                    board[i][j] = 'O';
                }
            }
        }

    }

    public void getResult(char[][] board, int x, int y) {
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) {
            return;
        }

        if (board[x][y] == 'X') {
            return;
        }

        if (board[x][y] == 'O') {
            result[x][y] = 'O';
//            System.out.println("x = " + x + ", y = " + y);
            getResult(board, x - 1, y);
            getResult(board, x, y + 1);
            getResult(board, x + 1, y);
            getResult(board, x, y - 1);
        }
    }
}
