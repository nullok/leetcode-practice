package com.caigouzi.dfs;

/**
 * X X X X
 * X O O X
 * X X O X
 * X O O X
 * @author ：lihan
 * @description： 130. 被围绕的区域
 * @date ：2020/8/11 8:42
 */
public class Num130 {
    private char[][] arr;
    public void solve(char[][] board) {
        int row = board.length;
        int column = board[0].length;

        // 从边界处O开始的地方 进行dfs，找到与边界连通的点，并标记为#
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == 0 || j == 0 || i == row - 1 || j == column - 1) {
                    if (board[i][j] == 'O') {
                        dfs(board, i, j);
                    }
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                if (board[i][j] == '#') {
                    board[i][j] = 'O';
                }
            }
        }



    }

    public void dfs(char[][] board, int i, int j) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] == 'X' || board[i][j] == '#') {
            return;
        }
        // 标记
        board[i][j] = '#';
        dfs(board, i+1, j); // 上
        dfs(board, i-1, j); // 下
        dfs(board, i, j + 1);
        dfs(board, i, j - 1);
    }
}
