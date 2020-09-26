package com.caigouzi.dfs;

import java.util.ArrayList;

/**
 * @author ：lihan
 * @description： 529. 扫雷游戏
 * @date ：2020/8/20 9:42
 */
public class Num529 {
    public static void main(String[] args) {
        System.out.println((char) (1 + '0'));
    }

    char[][] Board;
    int xShift[] = {-1,-1,-1,0,0,1,1,1};
    int yShift[] = {-1,0,1,-1,1,-1,0,1};
    public char[][] updateBoard(char[][] board, int[] click) {
        Board = board;
        if (board[click[0]][click[1]] == 'M') {
            board[click[0]][click[1]] = 'X';
            return board;
        }
        dfs(click[0], click[1]);
        return Board;
    }

    public void dfs(int i, int j) {
        if (i < 0 || j < 0 || i >= Board.length || j >= Board[0].length || Board[i][j] != 'E') {
            return;
        }
        int num = check(i, j);
        if (num == 0) {
            Board[i][j] = 'B';
            int m, n;
            for (int k = 0; k < 8; k++) {
                m = i + xShift[k];
                n = j + yShift[k];
                dfs(m, n);
            }

        } else {
            Board[i][j] = (char) (num + '0');
        }
    }

    public int check(int i, int j) {
        /* 统计周边地雷的个数 */
        int x, y;
        int sum = 0;
        for (int k = 0; k < 8; k++) {
            x = i + xShift[k];
            y = j + yShift[k];
            if (x >= 0 && x < Board.length && y >= 0 && y < Board[0].length && Board[x][y] == 'M') {
                sum++;
            }
        }
        return sum;
    }
}
