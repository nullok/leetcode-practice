package com.caigouzi.dfs;

import java.util.LinkedList;

/**
 * @author ：lihan
 * @description： 9. 单词搜索
 * @date ：2020/9/13 10:21
 */
public class Num79 {
    int height;
    int width;
    int[][] map;
    char[][] board;
    char[] word;
    int stringLen;
    public boolean exist(char[][] board, String word) {
        this.word = word.toCharArray();
        this.stringLen = word.length();
        this.board = board;
        height = board.length;
        width = board[0].length;
        map = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (board[i][j] == this.word[0]) {
                    if (dfs(i, j, 0)) return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(int i, int j, int index) {
        if (i < 0 || j < 0 || i >= height || j >= width || map[i][j] == 1 || index >= stringLen) {
            return false;
        }
        if (index == stringLen-1 && board[i][j] == word[index]) return true;
        if (board[i][j] != word[index]) return false;
        map[i][j] = 1;
        boolean result = dfs(i + 1, j, index + 1) || dfs(i - 1, j, index + 1) || dfs(i, j + 1, index + 1) || dfs(i, j - 1, index + 1);
        map[i][j] = 0;
        return result;
    }
}
