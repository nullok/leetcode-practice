package com.caigouzi.dfs;

/**
 *
 [
 [1,1,0,0,0],
 [1,1,0,0,0],
 [0,0,0,1,1],
 [0,0,0,1,1]]
 * @author ：lihan
 * @description： 200. 岛屿数量
 * @date ：2020/8/11 20:12
 */
public class Num200 {
    public int numIslands(char[][] grid) {
        if (grid.length == 0) return 0;
        int row = grid.length;
        int column = grid[0].length;
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0' || grid[i][j] == '2') {
            return;
        }

        grid[i][j] = '2';
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);

    }
}
