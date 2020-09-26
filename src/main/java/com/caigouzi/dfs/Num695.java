package com.caigouzi.dfs;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 [
 [1,1,0,0,0],
 [1,1,0,0,0],
 [0,0,0,1,1],
 [0,0,0,1,1]]
 * @author ：lihan
 * @description： 695. 岛屿的最大面积
 * @date ：2020/8/11 20:12
 */
public class Num695 {
    public int maxAreaOfIsland(int[][] grid) {
        if (grid.length == 0) return 0;
        int row = grid.length;
        int column = grid[0].length;
        int maxArea = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea,dfs(grid, i, j));
                }
            }
        }
        return maxArea;
    }

    public int dfs(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0 || grid[i][j] == 2) {
            return 0;
        }

        grid[i][j] = 2;
        int a = dfs(grid, i + 1, j);
        int b = dfs(grid, i - 1, j);
        int c = dfs(grid, i, j + 1);
        int d = dfs(grid, i, j - 1);
        return a + b + c + d + 1;
    }
}
