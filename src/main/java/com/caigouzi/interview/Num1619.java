package com.caigouzi.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author ：lihan
 * @description： 面试题 16.19. 水域大小
 * @date ：2020/8/16 10:23
 */
public class Num1619 {
    int[][] Land;
    int[] res;
    public int[] pondSizes(int[][] land) {
        Land = land;
        int m = land.length;
        int n = land[0].length;
        res = new int[m * n];
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (land[i][j] == 0) {
                    int deep = dfs(i, j);
                    res[index++] = deep;
                }
            }
        }
        res = Arrays.copyOfRange(res, 0, index);
        Arrays.sort(res);
        return res;
    }

    public int dfs(int i, int j) {
        if (i < 0 || j < 0 || i >= Land.length || j >= Land[0].length || Land[i][j] != 0) {
            return 0;
        }
        Land[i][j] = -1;
        return dfs(i + 1, j) + dfs(i - 1, j) + dfs(i, j + 1) + dfs(i, j - 1) + dfs(i + 1, j + 1) + dfs(i + 1, j - 1) + dfs(i - 1, j + 1) + dfs(i - 1, j - 1) + 1;
    }
}
